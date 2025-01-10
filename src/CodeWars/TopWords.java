package CodeWars;

import java.util.HashMap;
import java.util.List;

public class TopWords {

    String s;


    public TopWords(String s){

        this.s = s;
    }

    public void top3() {


        HashMap<Integer, String> testMap = new HashMap<>();

        testMap.put(1, this.s);

        System.out.println(testMap.get(1));

    }
}