package CodeWars;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {

        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("(");

        for (int i = 0; i < numbers.length; i++) {
            phoneNumber.append(i == 2 ? numbers[i] + ") "
                    : i == 5 ? numbers[i] + "-"
                    : numbers[i]);
        }
        return phoneNumber.toString();
    }
}