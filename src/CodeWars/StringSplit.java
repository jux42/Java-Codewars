package CodeWars;

import java.util.ArrayList;


public class StringSplit {
    public static String[] solution(String s) {

        ArrayList<String>  result = new ArrayList<>();


        for (int i = 0 ; i<(s.length()) ; i+=2 ){
            result.add (i + 1 < s.length()
                    ?("" + s.charAt(i) + s.charAt(i+1))
                    :("" + s.charAt(i) + '_'));
        }
        return result.toArray(new String[result.size()]);
    }
}
