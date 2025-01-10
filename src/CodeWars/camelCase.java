package CodeWars;

public class camelCase {
    public static String camelCase(String input) {

        StringBuilder outputBuilder = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) outputBuilder.append(" ").append(c);
            else outputBuilder.append(c);
        }
        return outputBuilder.toString();
    }


}