package ua.kiev.dans.matrix;

import java.util.Random;

public class MatrixMainClass {
    public static void main(String[] args) {
        Matrix<Integer> mat = new Matrix<>(4, 4);
        Random r = new Random();

        for (int i = 1; i <= mat.getRows(); i++) {
            Integer[] arr = new Integer[mat.getCols()];
            for (int j = 0; j < mat.getCols(); j++) {
                arr[j] = r.nextInt(100);
            }
            mat.setRow(i, arr);
        }
    }
}
