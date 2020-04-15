package ua.kiev.dans.summy;

import java.util.Arrays;

public class SummyMainClass {
    public static void main(String[] args) {
        String s = "1 2 3 4 5 6 7 8 9 10";
        long sum = Arrays.stream(s.split(" "))
                .mapToLong(Long::parseLong)
                .sum();
        System.out.println(sum);
    }
}
