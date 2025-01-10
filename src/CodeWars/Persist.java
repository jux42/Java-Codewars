package CodeWars;

public class Persist {
    public static int persistence(long n) {

        long modN = n;
        int counter = 0;
        long product;

        do {
            product = 1;
            while (modN > 0) {
                product *= (modN % 10);
                System.out.println(product);
                modN /= 10;
            }
            modN = product;
            counter++;
        } while (product >= 10);

        return n % 10 != n
            ? counter
            : 0;
    }
}