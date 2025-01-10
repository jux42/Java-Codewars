package CodeWars;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {

        int stillInside = 0;
        for (int[] stop : stops) {
            stillInside += (stop[0] - stop[1]);
        }
        return stillInside;
    }
}