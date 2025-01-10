package CodeWars;

public class MultiplesOfThreeOrFive {
    public static int solution(int number) {

        int result = 0;

        for (int i = 1 ; i < number ; i++  ){
            result+= i %5 == 0 || i %3 == 0 ?  i
                    : 0;
            System.out.println(result);

        }
        System.out.println(result);
        return result;
    }
}