package src.CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Accumul {
    public static String accum(String s) {

        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            resultBuilder.append(Character.toUpperCase(s.charAt(i)));
            for (int j = 0; j < i; j++) {
                resultBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
            resultBuilder.append("-");
        }
        return resultBuilder
        .deleteCharAt(resultBuilder.length()-1)
        .toString();
    }
}