package benimcalismalarim.önceki.mentoring.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
/*
Senaryo: Stok Takibi ve Depo Güncellemesi
Bir mağaza, popüler bir üründen stoklarına 5 tane eklemiştir.
Ürün stok bilgilerini bir listeye kaydeder.
Daha sonra, farklı bir listeye bu ürünlerin birer yedeğini taşıyarak yedek listeyi oluşturur.

Bu işlemler sırasında Collections.nCopies yöntemini kullanarak başlangıçtaki stok listesini
oluşturun ve bu listeyi başka bir listeye ekleyin.

     Görev:
     1-Ürün adı "Akıllı Saat" olan bir üründen stok bilgisi olarak 5 adet kaydeden bir liste oluşturun.
     2-Bu listeyi, başka bir yedek stok listesine ekleyin.
     3-Yedek listeye, stoklardan bağımsız olarak "Görünmez Telefon" adlı üründen 3 adet daha ekleyin.
     4-Hem ana stok listesini hem de yedek stok listesini ekrana yazdırın.
     */
        List<String> anaStokListesi = new ArrayList<>(Collections.nCopies(5, "Akıllı Saat"));
        System.out.println("Ana Stok Listesi: " + anaStokListesi);

        List<String> yedekStokListesi = new ArrayList<>(anaStokListesi);
        yedekStokListesi.addAll(Collections.nCopies(3, "Görünmez Telefon"));
        System.out.println("Yedek Stok Listesi: " + yedekStokListesi);
    }
}
