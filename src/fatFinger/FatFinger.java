package fatFinger;

//test commit to github

class FatFinger {

    static String capsLockProblem(String source) {

        if (source == null) {

            return null;

        }

        StringBuilder sb = new StringBuilder();
        char charArray[] = source.toCharArray();
        int i = 0;

        while (i < source.length()) {

            if ( charArray[i] == 'a' || charArray[i] == 'A') {

                i++;

                while (i < source.length() && (charArray[i] != 'a' || charArray[i] != 'A' )) {

                    sb.append(Character.toUpperCase(charArray[i++]));

                }

            }

            sb.append(charArray[i++]);

        }

        return sb.substring(0, sb.length());

    }

}
