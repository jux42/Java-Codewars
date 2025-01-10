package CodeWars;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class FindOdd {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> numbersAmount = new HashMap<>();

        AtomicInteger result = new AtomicInteger();
        for (int n : a) {
            if (numbersAmount.containsKey(n)) {
                numbersAmount.put(n, numbersAmount.get(n) + 1);
            } else {
                numbersAmount.put(n, 1);
            }
        }
        numbersAmount.forEach((key, amount) -> {
            if (amount % 2 != 0) result.set(key);
        });
        return result.get();
    }
}