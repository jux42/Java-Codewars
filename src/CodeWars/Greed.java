package CodeWars;

import java.util.ArrayList;

public class Greed{
    public static int greedy(int[] dice){
ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> twos = new ArrayList<>();
        ArrayList<Integer> threes = new ArrayList<>();
        ArrayList<Integer> fours = new ArrayList<>();
        ArrayList<Integer> fives = new ArrayList<>();
        ArrayList<Integer> sixes = new ArrayList<>();

        for(int i = 0 ; i<dice.length ; i++)
        {
            switch (dice[i]){
                case 1 :
                    ones.add(dice[i]);
                            break;
                case 2 :
                    twos.add(dice[i]);
                    break;
                case 3 :
                    threes.add(dice[i]);
                    break;
                case 4 :
                    fours.add(dice[i]);
                    break;
                case 5 :
                    fives.add(dice[i]);
                    break;
                case 6 :
                    sixes.add(dice[i]);
                    break;

            }

        }
        int score = 0;
        score += ones.size() == 3 ? 1000
                : ones.size()  == 5 ? 1200
                : ones.size() == 4 ? 1100
                : ones.size() == 2 ? 200
                : ones.size() == 1 ? 100
                : 0;
        score += fives.size() == 3 ? 500
                : fives.size() == 5 ? 600
                : fives.size() == 4 ? 550
                : fives.size() == 2 ? 100
                : fives.size() == 1 ? 50
                : 0;
        score += twos.size() >= 3 ? 200
                : 0;
        score += threes.size() >= 3 ? 300
                : 0;
        score += fours.size() >= 3 ? 400
                : 0;
        score += sixes.size() >= 3 ? 600
                : 0;
        System.out.println();
        return score;
    }
}