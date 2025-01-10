package CodeWars;

import java.util.*;

public class DoubleLinear {
    public static int dblLinear(int n) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        int counter = 0;

        while (counter < n) {
            int x = numbers.pollFirst();
            int y = (2 * x) + 1;
            numbers.add(y);
            int z = (3 * x) + 1;
            numbers.add(z);
            counter++;
        }
        return numbers.first();
    }
}