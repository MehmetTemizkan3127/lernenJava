package javacalismalarim.maps;

import javacalismalarim.konutekrari.map.Map;

public class MetodlarMap {
    public static void main(String[] args) {
        Map<String , Integer> hesapBakiyem = new HashMap<>();
        hesapBakiyem.put("dolar", 1500);
        hesapBakiyem.put("TL", 10000);
        hesapBakiyem.put("Euro", 2000);

        Map<String,Integer> market = new HashMap<>();
        market.put("Elma" , 50);
        market.put("Iphone" , 500); // dolar
        market.put("Ipad",200); // euro

// 1. method --> IphoneSatis()  --> Parametre - Dolar Bakiyesi , donus tipi kalan dolar bakiyesi
// Bu methodun amacı bir kisi dolar bakıyesini gönderecek ve Iphone alacak .
// hesabında kalan parayı return edecek. bu kalan para da map de dolar hesabı olarak güncellenecek.

// 2. method --> ElmaSatis() --> Parametre - TL Bakiyesi , donus tipi kalan TL bakiyesi
// Bu methodun amacı bir kisi TL bakıyesini gönderecek ve Elma alacak .
// hesabında kalan parayı return edecek. bu kalan para da map de TL hesabı olarak güncellenecek.

// 3. meyhod --> IpadSatis() --> Parametre - Dolar Bakiyesi , donus tipi kalan dolar bakiyesi
// Bu methodun amacı bir kisi Euro bakıyesini gönderecek ve Ipad alacak .
// hesabında kalan parayı return edecek. bu kalan para da map de Euro hesabı olarak güncellenecek.

// 4. metdoh --> son guncellenmiş hesap bakiyesi map imi alacak ve bana sunu yazdıracak.
// Sadece görmem yeterli ..
// Tl hesabınızda ..... TL vardır
// Dolar hesabınızda ..... Dolar vardır
// Eurö hesabınızda ..... Eurö vardır
    }
}
