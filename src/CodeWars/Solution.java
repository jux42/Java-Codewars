package src.CodeWars;

public class Solution {

    public static int[] twoSum(int[] numbers, int target) {

        int [] result = new int[2];

        for (int i = 0 ; i<numbers.length ; i++){
            for (int j = 0 ; j<numbers.length ; j++){

                if (numbers[i] + numbers[j] == target){
                    if (i == j) continue;
                    result[0] = j ;
                    result[1] = i;
                    break;
                }
            }
        }
        return result; // Do your magic!
    }
}
