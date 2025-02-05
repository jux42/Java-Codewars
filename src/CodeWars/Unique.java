package src.CodeWars;

import java.util.ArrayList;

public class Unique {
    public static double findUniq(double[] arr) {

        ArrayList<Double> firstNumber = new ArrayList<>();
        ArrayList<Double> secondNumber = new ArrayList<>();
        firstNumber.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (firstNumber.get(0) == arr[i]) firstNumber.add(arr[i]);
            else secondNumber.add(arr[i]);
        }
        return firstNumber.size() == 1 ? firstNumber.get(0)
                : secondNumber.get(0);
    }
}