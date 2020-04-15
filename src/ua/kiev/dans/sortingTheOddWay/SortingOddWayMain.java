package ua.kiev.dans.sortingTheOddWay;

import java.util.Arrays;

public class SortingOddWayMain {
    public static void main(String[] args) {
        Object[] resultDouble = SortingOddWay.sortingOddWay(new Double[] {68d,25d,99d,50d,10d,67d,2d,5d,8d,34d,67d});
        Object[] resultInteger = SortingOddWay.sortingOddWay(new Integer[] {8, 3, 4, 1, 2, 13, 11});
        Object[] resultShort = SortingOddWay.sortingOddWay(new Short[] {8, 3, 4, 1, 2, 13, 11});
        Object[] resultByte = SortingOddWay.sortingOddWay(new Byte[] {8, 3, 4, 1, 2, 13, 11});
        System.out.println(Arrays.toString(resultDouble));
        System.out.println(Arrays.toString(resultInteger));
        System.out.println(Arrays.toString(resultShort));
        System.out.println(Arrays.toString(resultByte));
    }
}
