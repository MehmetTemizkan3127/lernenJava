package benimcalismalarim.metodlar;

import java.util.Optional;

public class Met__Not_Pekiyi_Ternary {
    public static void main(String[] args) {

        Optional<Integer> not = Optional.ofNullable(null); // Null değeri burada güvenle tanımlandı

        String sonuc = not.map(n ->
                        (n >= 85) ? "Pekiyi" :
                                (n >= 70) ? "İyi" :
                                        (n >= 50) ? "Geçti" : "Kaldı")
                .orElse("Geçersiz not");

        System.out.println("Sonuç: " + sonuc);






    }
}
