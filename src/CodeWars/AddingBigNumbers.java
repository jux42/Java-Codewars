package src.CodeWars;

import java.util.ArrayList;
import java.util.Collections;

public class AddingBigNumbers {
    public static String add(String a, String b) {


        if (a.length() <= 19 && b.length() <= 19) {

            return String.valueOf(Long.parseLong(a) + Long.parseLong(b));
        }

        ArrayList<Character> aList = new ArrayList<>();
        ArrayList<Character> bList = new ArrayList<>();
        int indexCounter = Math.max(a.length(), b.length());


        for (int i = 0; i < indexCounter; i++) {
            if (i<a.length()) aList.add(a.charAt(i));
            if (i<b.length()) bList.add(b.charAt(i));
        }



        Collections.reverse(aList);
        Collections.reverse(bList);

        for (int i = 0; i < indexCounter; i++) {
            if (i >= a.length()) aList.add('0');
            else if (i >= b.length()) bList.add('0');
        }


        StringBuilder sumString = new StringBuilder();
        int temp = 0;

        for (int i = 0; i < aList.size(); i++) {

            int sum = Integer.parseInt(String.valueOf(aList.get(i)))
                    + Integer.parseInt(String.valueOf(bList.get(i)))
                    + temp;

            temp = sum > 9 ? 1
                    : 0;

            sumString.append(sum % 10);
        }

        sumString.append(temp>0 ? (char) (temp + '0') : "");

             return sumString.reverse().toString().replaceFirst("^0+", "");

    }

}