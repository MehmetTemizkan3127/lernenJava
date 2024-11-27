package benimcalismalarim.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Hw_1127_02_ArrayList {
    public static void main(String[] args) {
          /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

        List<Integer> sayilar = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        int toplam = getSum(new ArrayList<>(sayilar));
        System.out.println("Toplam: " + toplam);
    }

    public static int getSum(ArrayList<Integer> sayilar) {
        int getSum = 0;

        for (int i = 0; i < sayilar.size(); i++) {
            getSum += sayilar.get(i);
        }
        return getSum;
    }
}
