package benimcalismalarim.mentoring.arraylist;

import java.util.ArrayList;

public class Task03 {
    public static void main(String[] args) {
        // Soru 3 : 1 den 10 kadar olan sayılardan oluşan
        // ismi "sayilar" olan bir ArryaListi for döngüsü ile oluşturunuz.
        // Ve ArrayList i yazdırınız

        ArrayList<Integer> sayilar = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            sayilar.add(i);
        }
        System.out.println("sayilar = " + sayilar);
    }
}
