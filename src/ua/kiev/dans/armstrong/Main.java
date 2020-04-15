package ua.kiev.dans.armstrong;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<Long> list = Armstrong.getArmstrongList(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(list);

    }

}
