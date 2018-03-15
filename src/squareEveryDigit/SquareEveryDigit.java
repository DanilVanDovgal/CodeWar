package squareEveryDigit;

import java.util.stream.Collectors;

public class SquareEveryDigit {
    public static void main(String[] args) {
        int n = 9119;

        //first variant
        StringBuilder sb = new StringBuilder();
        int temp;

        for (char c : Integer.toString(n).toCharArray()) {
            temp = Character.getNumericValue(c);
            sb.append(temp * temp);
        }

        System.out.println(Integer.parseInt(sb.toString()));

        //second variant
        String result = String.valueOf(n).chars()
                .map(a -> Integer.parseInt(String.valueOf((char) a)))
                .map(b -> b * b)
                .mapToObj(String::valueOf).collect(Collectors.joining(""));

        System.out.println(Integer.parseInt(result));
    }
}
