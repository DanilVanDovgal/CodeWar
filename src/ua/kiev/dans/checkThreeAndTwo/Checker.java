package ua.kiev.dans.checkThreeAndTwo;

import java.util.HashMap;
import java.util.Map;

class Checker {

    static boolean checkThreeAndTwo(char[] data) {

        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : data) {
            charMap.merge(c, 1, Integer::sum);
        }

        String result = charMap.toString();

        return result.contains("3") && result.contains("2");

    }
}
