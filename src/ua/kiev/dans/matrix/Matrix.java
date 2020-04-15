package ua.kiev.dans.matrix;

public class Matrix<E> {
    private final int rows;
    private final int cols;
    private final E[][] matrix;

    @SuppressWarnings("unchecked")
    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = (E[][]) new Object[rows][cols];
    }

    public boolean setRow(int row, E[] arr) {
        if (row > rows || arr.length > cols) {
            return false;
        }
        matrix[row - 1] = arr;
        return true;
    }

    public E get(int i, int j) {
        if (i < 1 || j < 1)
            return null;
        if (i > rows || j > cols)
            return null;
        return matrix[i - 1][j - 1];
    }

    public boolean set(int i, int j, E obj) {
        if (i < 1 || j < 1)
            return false;
        if (i > rows || j > cols)
            return false;
        matrix[i - 1][j - 1] = obj;
        return true;
    }

    public boolean swap(int i1, int j1, int i2, int j2) {
        if (i1 < 1 || j1 < 1 || i2 < 1 || j2 < 1)
            return false;
        if (i1 > rows || i2 > rows || j1 > cols || j2 > cols)
            return false;
        E obj = matrix[i1 - 1][j1 - 1];
        matrix[i1 - 1][j1 - 1] = matrix[i2 - 1][j2 - 1];
        matrix[i2 - 1][j2 - 1] = obj;
        return true;
    }

    public String[][] toArray() {
        String[][] arr = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = matrix[i][j] + "";
            }
        }
        return arr;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
