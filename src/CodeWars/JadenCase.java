package src.CodeWars;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        char[] chars = phrase.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                if (foundSpace) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }

        return new String(chars);
    }


}