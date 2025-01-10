package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
public class TwoToOne {
    public static String longest (String s1, String s2) {
        ArrayList<Character> output = new ArrayList<>();

        for(int i = 0; i<s1.length() ; i++) {
            if (!output.contains(s1.charAt(i))){
                    output.add(s1.charAt(i));
                }
            }

        for(int i = 0; i<s2.length() ; i++) {
             if (!output.contains(s2.charAt(i))){
                    output.add(s2.charAt(i));
                }
            }
        Object[] result = output.toArray();
        Arrays.sort(result);

        return Arrays.toString(result).replace("[", "")
                                .replace("]", "")
                                .replace(", ", "");
    }
}