package benimcalismalarim.önceki.mentoring.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {

         /*
    Senaryo: Kitap Kategorileri
    Bir kitapçıda kitaplar kategorilere göre sıralanmış ve bir liste oluşturulmuştur.
    Liste üzerinde subList kullanarak belirli kategorilere erişim sağlamak için aşağıdaki görevleri tamamlayın.

    Görevler:
    1-Aşağıdaki kategorilerden oluşan bir ArrayList oluşturun:
    ["Roman", "Şiir", "Tarih", "Bilim", "Felsefe", "Çocuk", "Psikoloji", "Sanat"].
    2-İlk 4 kategoriyi içeren bir alt liste oluşturun ve yazdırın.
    3-Son 3 kategoriyi içeren bir alt liste oluşturun ve yazdırın.
    4-Listenin 3. ve 6. indeksleri arasındaki kategorileri içeren bir alt liste oluşturun ve yazdırın.
    Ek Görev: Alt Liste Üzerinde Değişiklik Yapma
    5- Alt listedeki 0. indexdeki elemanı "Bilim Kurgu" olarak güncelleyelim
    */

        List<String> kitapKatogorileri = new ArrayList<>(List.of("Roman", "Şiir", "Tarih", "Bilim", "Felsefe", "Çocuk", "Psikoloji", "Sanat"));
        System.out.println("kitapKatogorileri = " + kitapKatogorileri);

        List<String> ilkDortKitapKategoorisi = kitapKatogorileri.subList(0, 4);
        System.out.println("Ilk dört kitap kategorisi : " +ilkDortKitapKategoorisi );

        List<String> sonUcKitapKategoorisi = kitapKatogorileri.subList(kitapKatogorileri.size() - 3, kitapKatogorileri.size());
        System.out.println("Son üc kitap kategorisi : " +sonUcKitapKategoorisi );


        List<String> altList = kitapKatogorileri.subList(3, 6);
        System.out.println("Kitap kategorisinin ücüncü ve altinci indeks arasi : " + altList);

        altList.set(0, "Bilim Kurgu");
        System.out.println("Alt Listenin güncel hali = " + altList);
    }
}
