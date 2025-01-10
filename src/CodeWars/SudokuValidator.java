package CodeWars;

import java.util.ArrayList;

public class SudokuValidator {
    public static boolean validate(int[][] board) {

        int cellCounter;
        for (cellCounter = 3 ; cellCounter<board.length ; cellCounter +=3){
        for (int i = 0 ; i<board.length ; i++){

            ArrayList<Integer> checkArrayHoriz = new ArrayList<>();
            ArrayList<Integer> checkArrayVert = new ArrayList<>();
            for (int j = 0 ; j<board[i].length ; j++){

                if (checkArrayHoriz.contains(board[j][i]) ||
                    checkArrayVert.contains(board[i][j])  ||
                    board[i][j] == 0){
                    return false;
                }
                checkArrayVert.add(board[i][j]);
                checkArrayHoriz.add(board[j][i]);
            }
        }
       ArrayList<Integer> checkOneCell = new ArrayList<>();
            for (int[] numbers : board) {
                for (int j = cellCounter - 3; j < cellCounter; j++) {

                    if (checkOneCell.contains(numbers[j])) {
                        return false;
                    }
                    checkOneCell.add(numbers[j]);
                }
                if (checkOneCell.size() == 9) checkOneCell.clear();
            }
        }
        return true;
    }
}