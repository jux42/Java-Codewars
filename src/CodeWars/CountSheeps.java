package CodeWars;

public class CountSheeps {

    public static String countingSheep(int num) {

        StringBuilder sheepBuilder = new StringBuilder();
        for (int i = 1 ; i <= num ; i++){

            sheepBuilder
                    .append(i)
                    .append(" sheep...");
        }
        return sheepBuilder.toString();
      }

}