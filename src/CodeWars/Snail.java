package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class Snail {


    public static int[] snail(int[][] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        int n = array.length;
        int offset = 0;

        while (n > 0) {
            if (n == 1) {
                result.add(array[offset][offset]);
                break;
            }

            for (int i = 0; i < n - 1; i++) result.add(array[offset][offset + i]);
            for (int i = 0; i < n - 1; i++) result.add(array[offset + i][offset + n - 1]);
            for (int i = n - 1; i > 0; i--) result.add(array[offset + n - 1][offset + i]);
            for (int i = n - 1; i > 0; i--) result.add(array[offset + i][offset]);

            offset++;
            n -= 2;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }


    }

