package src.exos;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(processNumbers(List.of(1,2,4,6,8,5,9,150,3,10,16,14,23,56,87,95,96)));
    }

    public static List<Integer> processNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
    }

    
}

