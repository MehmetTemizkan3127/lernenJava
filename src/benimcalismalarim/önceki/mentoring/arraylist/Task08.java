package benimcalismalarim.önceki.mentoring.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task08 {
    public static void main(String[] args) {

    /* Görev: Öğrenci Durumlarını Güncelleme
        Bir öğretmen, öğrencilerin durumlarını bir ArrayList içerisinde tutuyor.
        Durumlar başlangıçta false (geçmedi) olarak belirlenmiş.
        Ancak, sınavları biten öğrencilerin durumlarını true (geçti) olarak güncellemek istiyor.
         Aşağıdaki işlemleri yaparak öğrencilerin durumlarını güncelleyin:

        1-ArrayList'te 5 öğrencinin sınav durumu bilgilerini tutan bir liste oluşturun ve
        ilk başta hepsini false olarak belirleyin.
        2-Tüm öğrencilerin durumlarını true (geçti) olarak güncelleyin.
        3-Güncellenmiş listeyi ekrana yazdırın.
        EK Görev :
        4-Hata yaptığını anlayan öğretmen ilk 3 öğrencinin notlarını tekrar false yapıyor
        5-Son durumu yazdırın
        */

        List<Boolean> ogrenciDurumu = new ArrayList<>(Collections.nCopies(5, false));
        System.out.println("Ögrencilerin durumu : " + ogrenciDurumu);

        Collections.fill(ogrenciDurumu, true);
        System.out.println("Ögrencilerin güncel durumu : " + ogrenciDurumu);


        Collections.fill(ogrenciDurumu.subList(0,3), false);
        System.out.println("Hata sonrasi güncelleme : " + ogrenciDurumu);
    }
}
