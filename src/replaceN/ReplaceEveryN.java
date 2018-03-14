package replaceN;

public class ReplaceEveryN {
    public static void main(String[] args) {
        String text = "Vader said: No, I am your father!!";
        char chars[] = text.toCharArray();
        int n = 1;
        char oldChar = 'i';
        char newChar = 'y';
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
    }
}
