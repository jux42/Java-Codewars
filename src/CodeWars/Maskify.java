package src.CodeWars;

public class Maskify {
    public static String maskify(String str) {

        String newStr = "";
        char [] strTab = str.toCharArray();

        if (str.length()<=4) return str;

        for (int i = 0; i<strTab.length ; i++ ){
            newStr+= i<strTab.length-4 ? '#'
                                       : strTab[i];
       }
        return newStr;
    }
}
