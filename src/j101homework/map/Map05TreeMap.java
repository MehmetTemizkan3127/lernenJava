package j101homework.map;

import java.util.Map;
import java.util.TreeMap;

public class Map05TreeMap {
    public static void main(String[] args) {
        /*Task 02 )
        // Task -> Verilen bir Stringdeki harfleri sayısını return  eden method create ediniz
        //  Input : Hellooo
        //  output : H=1, e=1, l=2, o=3

        String input = "eyedipadanadapideye";*/

        String input = "eyedipadanadapideye";
        Map<Character, Integer> karekterMap = new TreeMap<>();

        for (char ch : input.toCharArray()){
            karekterMap.put(ch,karekterMap.getOrDefault(ch,0)+1);
        }






    }
}
