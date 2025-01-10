package CodeWars;

public class XO {
    public static boolean getXO (String str) {

        String strLower = str.toLowerCase();
        int counter = 0;
        for (char letter : strLower.toCharArray()) {
            counter =  letter == 'x' ? counter+1
                : letter == 'o' ? counter-1
                : counter;
        }

    return counter == 0;
    }
}