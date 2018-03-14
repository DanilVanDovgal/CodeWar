package invertArrayMiddle;

import java.util.Arrays;

public class InvertArrayMiddleMainClass {
    public static void main(String[] args) {
        int n = 5;
        int arr[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            arr[i][0] = i + 1;

            if (i == 0 || i == n - 1) {
                for (int j = 1; j < n - 1; j++)
                    arr[i][j] = arr[i][j - 1] + n;
            } else{
                arr[i][1] = i * n + 2;
                for (int j = 2; j < n - 1; j++)
                    arr[i][j] = arr[i][j - 1] + 1;
            }

            arr[i][n - 1] = arr[i][0] + (n - 1) * n;
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
