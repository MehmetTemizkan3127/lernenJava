package javacalismalarim.maps;

import javacalismalarim.konutekrari.map.Map;

import java.util.HashMap;

public class metod1 {


    public class IphoneSatis {
        private static final double IPHONE_FIYATI = 1000.0; // Örnek fiyat
        private Map<String, Double> hesaplar;

        public IphoneSatis() {
            hesaplar = new HashMap<>();
        }

        public double IphoneSatis(String kullaniciAdi, double dolarBakiyesi) {
            if (dolarBakiyesi >= IPHONE_FIYATI) {
                double kalanBakiye = dolarBakiyesi - IPHONE_FIYATI;
                hesaplar.put(kullaniciAdi, kalanBakiye);
                return kalanBakiye;
            } else {
                System.out.println("Yetersiz bakiye!");
                return dolarBakiyesi;
            }
        }

        public Double getDolarBakiyesi(String kullaniciAdi) {
            return hesaplar.getOrDefault(kullaniciAdi, 0.0);
        }
    }

}
