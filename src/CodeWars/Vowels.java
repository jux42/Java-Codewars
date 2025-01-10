package CodeWars;

public class Vowels {

    public static int getCount(String str) {
        int counter = 0;

        for (char letter : str.toCharArray()) {
            switch (letter) {
                case ('a'):
                case ('e'):
                case ('i'):
                case ('o'):
                case ('u'):
                    counter++;
            }
        }
        return counter;
    }

}