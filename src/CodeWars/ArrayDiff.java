package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> numbers = new java.util.ArrayList<>(Arrays.stream(a).boxed().toList());
        List<Integer> numbersToRemove = Arrays.stream(b).boxed().toList();
        List <Integer> numbersLeft = new ArrayList<>();

        numbers.forEach(n->{
            if (!numbersToRemove.contains(n)) numbersLeft.add(n);
        });
        return numbersLeft.stream().mapToInt(Integer::intValue).toArray();
    }
}