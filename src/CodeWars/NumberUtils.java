package src.CodeWars;
public class NumberUtils {
    public static boolean isNarcissistic(int number) {

        String numberString = String.valueOf(number);
        int result=0;
        
        for(int c=0; c<numberString.length(); c++){
            result+= (int) Math.pow(number%10, numberString.length());
            number/=10;
         }
         return result==Integer.parseInt(numberString);
    }
}