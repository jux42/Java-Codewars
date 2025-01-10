package CodeWars;

import java.util.*;

public class Permutations {

    public static int factorialService(int n) {
        int num = 1;
        for (int i = 2; i <= n; i++) {
            num *= i;
        }
        return num;
    }

    public static List<String> singlePermutations(String s) {

        HashMap<Character, Integer> charCounter = new HashMap<>();
        List<Character> stringListed = new ArrayList<>();
        int counter = 0;
        for (char lettre : s.toCharArray()) {
            if (!stringListed.contains(lettre)) ;
            stringListed.add(lettre);
            charCounter.put(lettre, charCounter.getOrDefault(lettre, 0) + 1);

        }

        int numerateur = 1;
        int denominateur = 1;
        numerateur = factorialService(s.length());

        for (int value : charCounter.values()) {
            denominateur *= factorialService(value);
        }

        int roundSize = numerateur / denominateur;
        List<String> result = new ArrayList<>();

        while (result.size() < roundSize) {
            StringBuilder shuffledString = new StringBuilder();
            Collections.shuffle(stringListed);
            stringListed.forEach(shuffledString::append);
            System.out.println(shuffledString);

            if (result.contains(shuffledString.toString())) continue;
            else {
                result.add(shuffledString.toString());
            }
        }
        return result;
    }
}
