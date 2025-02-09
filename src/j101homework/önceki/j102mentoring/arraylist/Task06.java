package j101homework.önceki.j102mentoring.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Task06 {
    public static void main(String[] args) {
         /*
        Senaryo 2: Favori Yemekler Listesi
        Bir restoranda müşterilerin en sevdikleri yemeklerin olduğu bir liste oluşturulmuştur.
        Liste üzerinde indexOf ve get yöntemlerini kullanarak işlemler yapalım.

        Görevler:
        1-Aşağıdaki yemeklerden oluşan bir liste oluşturun:
        ["Pizza", "Burger", "Sushi", "Pasta", "Taco"].
        2-Müşteri "Sushi" yemeğini arıyor. Listenin kaçıncı sırada olduğunu bulun.
        3-Listenin üçüncü (indeks 2) yemeğini öğrenmek için get yöntemini kullanın.
        4-Listeye yeni bir yemek olarak "Pizza" yı bir kez daha ekleyin.
        5-İlk "Pizza"nın indeksini bulun.
        6-Listeyi yazdırarak doğrulayın.
        */

        List<String> favoriYemekler = new ArrayList<>(List.of("Pizza", "Burger", "Sushi", "Pasta", "Taco"));
        System.out.println("Yemek Listesi = " + favoriYemekler);

       int sushiIndex = favoriYemekler.indexOf("Sushi");
        System.out.println("Aranilan sushi yemegi = " + sushiIndex);

        String ucuncuYemek = favoriYemekler.get(2);
        System.out.println("Yemek Listesinin 3. yemegi = " + ucuncuYemek);

        favoriYemekler.add("Pizza");

        int firstPizzaIndex = favoriYemekler.indexOf("Pizza");
        System.out.println("Ilk Pizza indeksi = " + firstPizzaIndex);

        System.out.println("Güncel Yemek Listesi = " + favoriYemekler);






    }
}
