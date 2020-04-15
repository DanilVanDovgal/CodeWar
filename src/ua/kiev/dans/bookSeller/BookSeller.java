package ua.kiev.dans.bookSeller;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BookSeller {
    public static void main(String[] args) {
        String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = new String[] {"A", "B"};
        StringBuilder sb = new StringBuilder();

        String s = Arrays.stream(cd)
                .map(a -> a + " : " + Arrays.stream(art)
                                            .filter(c -> c.startsWith(a))
                                            .mapToInt(b -> Integer.parseInt(b.replaceAll("\\D", "")))
                                            .sum())
                .map(c -> "(" + c + ")")
                .collect(Collectors.joining(" - "));

        System.out.println(s);



        for(int i = 0; i < cd.length; i++) {
            int sum = 0;
            for(String str : art) {
                if(str.startsWith(cd[i]))
                    sum += Integer.parseInt(str.replaceAll("\\D", ""));
            }
            sb.append("(").append(cd[i]).append(" : ").append(sum).append(")");
            if(i < cd.length - 1)
                sb.append(" - ");
        }
        System.out.println(sb.toString());
    }
}
