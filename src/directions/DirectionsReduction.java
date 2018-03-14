package directions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DirectionsReduction {

    private static int myCompare(String s1, String s2) {
        if (s1.equals("NORTH") && s2.equals("SOUTH") || s1.equals("SOUTH") && s2.equals("NORTH"))
            return 0;
        else if (s1.equals("EAST") && s2.equals("WEST") || s1.equals("WEST") && s2.equals("EAST"))
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        String arr[] = new String[]{"NORTH", "WEST", "SOUTH", "EAST", "WEST", "SOUTH", "EAST", "NORTH",
                "WEST", "SOUTH", "EAST", "WEST", "SOUTH", "EAST"};

        long start = System.nanoTime();
        List<String> list = new ArrayList<>();

        for (String s : arr) {
            if (list.size() == 0)
                list.add(s);
            else {
                if (myCompare(list.get(list.size() - 1), s) == 0)
                    list.remove(list.size() - 1);
                else
                    list.add(s);
            }
        }

        String result[] = new String[list.size()];
        list.toArray(result);
        System.out.println(Arrays.toString(result));
        System.out.println(System.nanoTime() - start);

        start = System.nanoTime();
        Stack<String> stack = new Stack<>();

        for (String s : arr) {
            String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch (s) {
                case "NORTH" :
                    if ("SOUTH".equals(lastElement))
                        stack.pop();
                    else
                        stack.push(s);
                    break;
                case "SOUTH" :
                    if ("NORTH".equals(lastElement))
                        stack.pop();
                    else
                        stack.push(s);
                    break;
                case "EAST" :
                    if ("WEST".equals(lastElement))
                        stack.pop();
                    else
                        stack.push(s);
                    break;
                case "WEST" :
                    if ("EAST".equals(lastElement))
                        stack.pop();
                    else
                        stack.push(s);
            }
        }

        String result2[] = stack.toArray(new String[0]);
        System.out.println(Arrays.toString(result2));
        System.out.println(System.nanoTime() - start);
    }
}
