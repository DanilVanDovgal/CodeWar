package ua.kiev.dans.howGoodAreYouReally;

import java.util.Arrays;

public class HowGood {
    public static void main(String[] args) {
        int[] arr = new int[] {100, 40, 34, 57, 29, 72, 57, 88};
        int yourPoints = 75;
        int avg = (Arrays.stream(arr).sum() + yourPoints) / (arr.length + 1);
        System.out.println(yourPoints > avg);
    }
}
