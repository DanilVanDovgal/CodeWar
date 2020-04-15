package ua.kiev.dans.sortArrayByValueAndIndex;

public class SortArrayByValueAndIndexMain {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 2, 3, 1, 5, 2, 10, 99, 100, 33, 45, 1, 9, 56, 78, 89, 34, 23, 12, 45, 50, 3};

        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            SortArrayByValueAndIndex.sortArrayByValueAndIndex(arr);
            System.out.println("1 : " + (System.nanoTime() - start));

            start = System.nanoTime();
            SortArrayByValueAndIndex.sortArrayByValueAndIndexStream(arr);
            System.out.println("2 : " + (System.nanoTime() - start));
        }
    }
}
