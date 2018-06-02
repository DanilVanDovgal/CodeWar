package fatFinger;

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

                while (++i < source.length()) {

                    if (charArray[i] == 'a' || charArray[i] == 'A') {
                        continue;
                    }

                    sb.append(Character.toUpperCase(charArray[i]));

                }

            } else {

                sb.append(charArray[i++]);

            }

        }

        return sb.substring(0, sb.length());

    }

}
