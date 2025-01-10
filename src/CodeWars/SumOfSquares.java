package CodeWars;

import java.util.Arrays;

public class SumOfSquares {

    public static int nSquaresFor(int n) {
        if (isPerfectSquare(n)) {
            return 1;
        }

        for (int i = 1; i * i <= n; i++) {
            if (isPerfectSquare(n - i * i)) {
                System.out.println(n - i * i);
                return 2;
            }
        }

        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }

        return 3;
    }

    private static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }
  }