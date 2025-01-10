package CodeWars;

import java.util.Arrays;
import java.util.List;

public class SpinWords {

    public static String spinWords(String sentence) {

        List<String> wordsReversed = Arrays.stream(sentence.split(" ")).toList();
        StringBuilder resultBuilder = new StringBuilder();

        wordsReversed.forEach(s -> {
            StringBuilder tempBuilder = new StringBuilder();

            if (s.length() > 5) {
                tempBuilder.append(s).reverse();
                tempBuilder.append(" ");
            } else {
                tempBuilder.append(s);
                tempBuilder.append(" ");
            }

            resultBuilder.append(tempBuilder);
        });

        return resultBuilder.toString().trim();

    }
}