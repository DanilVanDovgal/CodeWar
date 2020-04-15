package ua.kiev.dans.squareUp;

import java.util.Arrays;

public class SquareUp {
    public static void main(String[] args) {

        int n = 2;
        int temp = n;
        int[] arr = new int[n * n];
        int counter = arr.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= temp; j++) {
                arr[counter--] = j;
            }
            temp--;
            counter -= i;
        }

        System.out.println(Arrays.toString(arr));
    }
}
