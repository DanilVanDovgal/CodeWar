package rangeExtraction;

public class RangeExtractionMain {
    public static void main(String[] args) {
        int arr[] = new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        StringBuilder sb = new StringBuilder();
        int temp, j, count;

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            temp = arr[i];
            j = i + 1;
            count = 0;
            while (j < arr.length) {
                if (temp + 1 != arr[j]) {
                    if (count < 2) {
                        sb.append(",");
                        break;
                    } else {
                        sb.append("-").append(arr[--j]).append(",");
                        i = j;
                        break;
                    }
                } else {
                    temp = arr[j++];
                    count++;
                    if (j == arr.length && count > 1) {
                        sb.append("-").append(arr[--j]);
                        i = j;
                        break;
                    } else if (j == arr.length) {
                        sb.append(",");
                    }
                }
            }

        }
        System.out.println(sb.toString());
    }
}
