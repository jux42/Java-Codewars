package CodeWars;

public class TraillingZeros {
    public static int zeros(int n) {

        int zeroCounter = 0;
        int divider = 5;

        while (divider<=n){
            int divided = n/divider;
            zeroCounter+=divided;
            divider*=5;
        }

        return zeroCounter;
    }

}