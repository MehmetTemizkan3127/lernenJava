package j20statickeyword;

import java.time.LocalDate;

public class Shop {

    //Ayın çift günlerinde ayakkabılara %10 indirim yapan bir program yaz.
    static double shoes = 100;

    static {//Bu class'tan herhangi bir şey çağrıldığında yada obje oluşturulduğunda ilk bu block çalışır. Tekrarlı işlmeler yapılsa dahi sadece bir kez çalışır.
        System.out.println("Static block ilk çalışır.");
        if (LocalDate.now().getDayOfMonth() % 2 == 0) {
            shoes = shoes * 0.9;
            System.out.println("%10 indirim uygulanmıştır.");
        } else {
            System.out.println("Gün ayın tek günü olduğu için indirim uygulanmamaktadır.");
        }
    }

    static void hello() {
        System.out.println("Hello World");
    }

    {//Static olmayan blocklar her obje oluşturulduğunda bir kez çağrılırlar.
        System.out.println("Statick olmayan block!!!");
    }

    {
        System.out.println("Statick olmayan block 2!!!");
    }

    {
        System.out.println("Statick olmayan block 3!!!");
    }


}
