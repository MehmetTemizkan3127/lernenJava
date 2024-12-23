package benimcalismalarim.önceki.homework;

import java.util.ArrayList;
import java.util.List;

public class Hw_1127_04_ArrayList {
    public static void main(String[] args) {
          /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin
        Return String arrayList
        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */
        List<String> renkler = new ArrayList<>(List.of("yellow", "red", "blue", "red", "blue"));

        String s1 = "blue";
        String s2 = "yellow";


        List<String> updatedRenkler = changeInArraylist(renkler, s1, s2);
        System.out.println(updatedRenkler);
    }

    public static List<String> changeInArraylist(List<String> renkler, String s1, String s2) {

        for (int i = 0; i < renkler.size(); i++) {
            if (renkler.get(i).equals(s1)) {
                renkler.set(i, s2);
            }
        }

        return renkler;
    }
}
