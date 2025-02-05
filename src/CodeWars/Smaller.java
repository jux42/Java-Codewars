package src.CodeWars;

import java.util.Arrays;

public class Smaller {
    public static int[] smaller(int[] unsorted) {

        int[] smallerNums = new int[unsorted.length];
        Arrays.fill(smallerNums, 0);

        for (int i = 0; i < smallerNums.length; i++) {

            for (int j = i + 1; j < unsorted.length; j++) {
                if (i == unsorted.length - 1) {
                    break;
                }
                smallerNums[i] += unsorted[i] > unsorted[j] ? 1
                    : 0;
            }
        }
        return smallerNums;
    }

}