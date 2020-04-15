package ua.kiev.dans.strongPassword;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Ab1";
        int length = 3;

        int answer = minimumNumber(length, password);
        System.out.println(answer);

    }

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        int value = 0;

        if (!password.matches(".*?[a-z]+.*?"))
            value++;

        if (!password.matches(".*?[A-Z]+.*?"))
            value++;

        if (!password.matches(".*?[0-9]+.*?"))
            value++;

        if (!password.matches(".*?[!@#$%^&*()\\-+]+.*?"))
            value++;

        if (password.length() + value != 6) {
            value = value + (6 - (password.length() + value));
        }

        return value;

    }

}
