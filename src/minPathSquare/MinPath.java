package minPathSquare;

public class MinPath {
    public static void main(String[] args) {

        int[][] smallSquare = new int[][]
                {
                        { 1, 2, 3, 6, 2, 8, 1 },
                        { 4, 8, 2, 4, 3, 1, 9 },
                        { 1, 5, 3, 7, 9, 3, 1 },
                        { 4, 9, 2, 1, 6, 9, 5 },
                        { 7, 6, 8, 4, 7, 2, 6 },
                        { 2, 1, 6, 2, 4, 8, 7 },
                        { 8, 4, 3, 9, 2, 5, 8 }
                };
        int x = 4; int y = 2;
        int i = 0; int j = 0;
        int minPath = smallSquare[i][j];

        while (i < y || j < x) {
            if (i < y && j < x) {
                if (smallSquare[i + 1][j] < smallSquare[i][j + 1])
                    i++;
                else
                    j++;
                minPath += smallSquare[i][j];
            }
            else if (i == y) {
                for(int k = j + 1; k <= x; k++) {
                    minPath += smallSquare[i][k];
                    j++;
                }
            }
            else if (j == x) {
                for(int k = i + 1; k <= y; k++) {
                    minPath += smallSquare[k][j];
                    i++;
                }
            }
        }

        System.out.println(minPath);
    }
}
