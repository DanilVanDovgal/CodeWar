package createPhoneNumber;

import java.util.stream.IntStream;

public class PhoneNumber {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //1
        System.out.println(String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                IntStream.of(arr).boxed().toArray()));
        //2
        System.out.println(String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]));
    }
}
