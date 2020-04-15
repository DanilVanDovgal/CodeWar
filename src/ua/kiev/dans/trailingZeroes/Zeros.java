package ua.kiev.dans.trailingZeroes;

public class Zeros {

    public static void main(String[] args) {
        int n = 4617999;
        int res = 0;
        int temp;

        int i = 5;
        while ((temp = n / i) >= 1) {
            res += temp;
            i *= 5;
        }

        System.out.println(res);
    }
}
