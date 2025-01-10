package CodeWars;

public class TicTacToe {

    public static int isSolved(int[][] board) {

        int winnerH = 0;
        int winnerV = 0;
        int winnerD1 = 0;
        int winnerD2 = 0;
        boolean globalEmptySpots = false;
        boolean localEmptySpots = false;
        boolean localLocalEmptySpots = false;

        for (int[] spots : board) {
            localEmptySpots = false;

            if (spots[0] == 0 || spots[1] == 0 || spots[2] == 0) {
                globalEmptySpots = true;
                localEmptySpots = true;
            }
            if (spots[0] == spots[1] && spots[0] == spots[2] && !localEmptySpots) {
                winnerV = spots[0] + spots[1] + spots[2];
                if (winnerV == 6) return 2;
                if (winnerV == 3) return 1;
            }
        }
        localEmptySpots = false;

        for (int i = 0; i < 3; i++) {
            localLocalEmptySpots = false;
            winnerH = 0;

            for (int j = 0; j < 3; j++) {
                if (board[j][i] == 0) {
                    globalEmptySpots = true;
                    localLocalEmptySpots = true;
                }
                winnerH += board[j][i];
                if (winnerH == 6 && !localLocalEmptySpots && j == 2) return 2;
                if (winnerH == 3 && !localLocalEmptySpots && j == 2) return 1;
                System.out.println(winnerH);
            }
            if (board[i][i] == 0) {
                globalEmptySpots = true;
                localEmptySpots = true;
            }
            winnerD1 += board[i][i];
            if (winnerD1 == 6 && !localEmptySpots && i == 2) return 2;
            if (winnerD1 == 3 & !localEmptySpots && i == 2) return 1;
        }
        localEmptySpots = false;

        int j = 0;
        for (int i = 2; i >= 0; i--) {

            if (board[i][j] == 0) {
                globalEmptySpots = true;
                localEmptySpots = true;
            }

            winnerD2 += board[i][j];
            if (winnerD2 == 6 && !localEmptySpots && i == 0) return 2;
            if (winnerD2 == 3 && !localEmptySpots && i == 0) return 1;
            j++;
        }
        localEmptySpots = false;

        if (globalEmptySpots) return -1;
        else return 0;
    }
}


