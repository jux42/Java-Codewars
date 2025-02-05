package src.CodeWars;

import java.util.Arrays;

public class NextSmaller {


    public static long nextSmaller(long n) {

        char[] nTab = String.valueOf(n).toCharArray();
        char[] ntabInitial = Arrays.copyOf(nTab, nTab.length);
        Arrays.sort(nTab);

        if (Arrays.equals(nTab, ntabInitial)){
            return -1;
        }


        while (true) {
                n--;
                char[] nTabBis = String.valueOf(n).toCharArray();
                if (nTabBis.length != nTab.length) {
                    return -1;
                    }
                Arrays.sort(nTabBis);
                if (Arrays.equals(nTab, nTabBis)) return n;

        }
    }
}