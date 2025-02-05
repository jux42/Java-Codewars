package src.CodeWars;

public class DRoot {
    public static int digital_root(int n) {

        String nStr = String.valueOf(n);
        int nSum = 0;
        for (Character c : nStr.toCharArray()) {
            nSum += (Integer.parseInt(c.toString()));
        }
        return nSum < 10 ? nSum
            : digital_root(nSum);
    }
}