package sumOfTwoBin;

class SumOfTwoBin {

    static long add(int a, int b) {

        if (b == 0) {
            return a;
        }

        int sum = a ^ b;
        int pick = (a & b) << 1;

        return add(sum, pick);

    }

}
