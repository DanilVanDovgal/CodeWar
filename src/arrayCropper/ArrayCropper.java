package arrayCropper;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayCropper {

    private static Set<Integer> getZeroSet(int arr[]) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                set.add(i);
            } else {
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                set.add(i);
            } else {
                break;
            }
        }
        return set;
    }

    public static void main(String args[]) {

        int arr[][] =  {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        long start = System.nanoTime();

        int sumColumns[] = new int[arr[0].length];
        int sumRows[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumColumns[j] += arr[i][j];
                sumRows[i] += arr[i][j];
            }
        }

        Set<Integer> setZeroRows = getZeroSet(sumRows);
        Set<Integer> setZeroCols = getZeroSet(sumColumns);

        int result[][] = new int[arr.length - setZeroRows.size()][];
        int count;
        int row = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!setZeroRows.contains(i)) {
                int temp[] = new int[arr[i].length - setZeroCols.size()];
                count = 0;
                for (int j = 0; j < arr[i].length; j++) {
                    if (!setZeroCols.contains(j)) {
                        temp[count++] = arr[i][j];
                    }
                }
                result[row++] = temp;
            }
        }

        System.out.println(System.nanoTime() - start);
        System.out.println(Arrays.deepToString(result));
    }
}
