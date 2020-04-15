package ua.kiev.dans.replaceN;

public class ReplaceEveryN {
    public static void main(String[] args) {
        String text = "Vader said: No, I am your father!";
        char[] chars = text.toCharArray();
        int n = 2;
        char oldChar = 'a';
        char newChar = 'o';
        int cursor = 0;

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == oldChar) {
                cursor++;
                if(cursor % n == 0)
                    chars[i] = newChar;
            }
        }

        String result = new String(chars);
        System.out.println(result);
        System.out.println(result.equals("Vader soid: No, I am your fother!"));
    }
}
