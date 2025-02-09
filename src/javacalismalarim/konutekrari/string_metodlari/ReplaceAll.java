package javacalismalarim.konutekrari.string_metodlari;

public class ReplaceAll {
    public static void main(String[] args) {
        // 1. \\s : Boşluk karakterlerini ifade eder.
        // "Java   Programlama  Dili" içindeki boşluk karakterlerini "-" ile değiştirir.
        String ornekBosluk = "Java   Programlama  Dili";
        String sonucBosluk = ornekBosluk.replaceAll("\\s", "-");
        System.out.println("1. \\s (Boşluklar): " + sonucBosluk);
        // Çıktı: "Java---Programlama--Dili"

        // 2. \\S : Boşluk olmayan karakterleri ifade eder.
        // "Java Programlama Dili" içindeki boşluk olmayan her karakteri "*" ile değiştirir.
        String ornekBoslukOlmayan = "Java Programlama Dili";
        String sonucBoslukOlmayan = ornekBoslukOlmayan.replaceAll("\\S", "*");
        System.out.println("2. \\S (Boşluk olmayanlar): " + sonucBoslukOlmayan);
        // Çıktı: "**** *********** *****"

        // 3. \\w : Kelime karakterlerini ifade eder (a-z, A-Z, 0-9, _).
        // "Merhaba_Dunya 123!" içindeki kelime karakterlerini "#" ile değiştirir.
        String ornekKelime = "Merhaba_Dunya 123!";
        String sonucKelime = ornekKelime.replaceAll("\\w", "#");
        System.out.println("3. \\w (Kelime karakterleri): " + sonucKelime);
        // Çıktı: "#######_##### ###!"

        // 4. \\W : Kelime karakteri olmayanları ifade eder.
        // "Merhaba_Dunya 123!" içindeki kelime olmayan karakterleri "@" ile değiştirir.
        String ornekKelimeOlmayan = "Merhaba_Dunya 123!";
        String sonucKelimeOlmayan = ornekKelimeOlmayan.replaceAll("\\W", "@");
        System.out.println("4. \\W (Kelime karakteri olmayanlar): " + sonucKelimeOlmayan);
        // Çıktı: "Merhaba_Dunya@123@"

        // 5. \\d : Rakamları ifade eder (0-9).
        // "Fiyat: 100 TL" içindeki rakamları "*" ile değiştirir.
        String ornekRakam = "Fiyat: 100 TL";
        String sonucRakam = ornekRakam.replaceAll("\\d", "*");
        System.out.println("5. \\d (Rakamlar): " + sonucRakam);
        // Çıktı: "Fiyat: *** TL"

        // 6. \\D : Rakam olmayan karakterleri ifade eder.
        // "Fiyat: 100 TL" içindeki rakam olmayan karakterleri "#" ile değiştirir.
        String ornekRakamOlmayan = "Fiyat: 100 TL";
        String sonucRakamOlmayan = ornekRakamOlmayan.replaceAll("\\D", "#");
        System.out.println("6. \\D (Rakam olmayanlar): " + sonucRakamOlmayan);
        // Çıktı: "######100####"

        // 7. . : Herhangi bir karakteri ifade eder (yeni satır hariç).
        // "Merhaba!" içindeki her karakteri "*" ile değiştirir.
        String ornekHerKarakter = "Merhaba!";
        String sonucHerKarakter = ornekHerKarakter.replaceAll(".", "*");
        System.out.println("7. . (Her karakter): " + sonucHerKarakter);
        // Çıktı: "********"

        // 8. [abc] : Belirtilen karakterlerden herhangi birini ifade eder.
        // "Java" içindeki "a" karakterlerini "*" ile değiştirir.
        String ornekBelirliKarakter = "Java";
        String sonucBelirliKarakter = ornekBelirliKarakter.replaceAll("[a]", "*");
        System.out.println("8. [abc] (Belirli karakterler): " + sonucBelirliKarakter);
        // Çıktı: "J*v*"

        // 9. [^abc] : Belirtilen karakterler dışındaki herhangi bir karakteri ifade eder.
        // "Java" içindeki "a" karakteri dışında kalan her karakteri "*" ile değiştirir.
        String ornekOlmayanKarakter = "Java";
        String sonucOlmayanKarakter = ornekOlmayanKarakter.replaceAll("[^a]", "*");
        System.out.println("9. [^abc] (Belirli olmayan karakterler): " + sonucOlmayanKarakter);
        // Çıktı: "*a*a"

        // 10. ^ ve $ : Satırın başlangıcı ve sonu.
        // "Merhaba" kelimesinin başına "Başlangıç: " ve sonuna " Son" ekler.
        String ornekSatir = "Merhaba";
        String sonucBaslangic = ornekSatir.replaceAll("^", "Başlangıç: ");
        String sonucSon = ornekSatir.replaceAll("$", " Son");
        System.out.println("10. ^ (Başlangıç): " + sonucBaslangic);
        System.out.println("10. $ (Son): " + sonucSon);
        // Çıktı: "Başlangıç: Merhaba" ve "Merhaba Son"

        // 11. {n} ve {n,m} : Belirli sayıda tekrar.
        // "aaaabbbcc" içindeki "a" karakterinin 2 kez tekrarı yerine "*" koyar.
        String ornekTekrar = "aaaabbbcc";
        String sonucTekrar = ornekTekrar.replaceAll("a{2}", "*");
        System.out.println("11. {n} (Tekrar sayısı): " + sonucTekrar);
        // Çıktı: "**aabbbcc"

        // 12. + : Bir veya daha fazla tekrar.
        // "aabb" içindeki bir veya daha fazla "a" karakterini "*" ile değiştirir.
        String ornekBirdenFazla = "aabb";
        String sonucBirdenFazla = ornekBirdenFazla.replaceAll("a+", "*");
        System.out.println("12. + (Bir veya daha fazla): " + sonucBirdenFazla);
        // Çıktı: "*bb"

        // 13. * : Sıfır veya daha fazla tekrar.
        // "aabb" içindeki sıfır veya daha fazla "a" karakterini "*" ile değiştirir.
        String ornekSifirdanFazla = "aabb";
        String sonucSifirdanFazla = ornekSifirdanFazla.replaceAll("a*", "*");
        System.out.println("13. * (Sıfır veya daha fazla): " + sonucSifirdanFazla);
        // Çıktı: "**b*b"

        // 14. ? : Sıfır veya bir tekrar.
        // "aabb" içindeki sıfır veya bir "a" karakterini "*" ile değiştirir.
        String ornekSifirVeyaBir = "aabb";
        String sonucSifirVeyaBir = ornekSifirVeyaBir.replaceAll("a?", "*");
        System.out.println("14. ? (Sıfır veya bir): " + sonucSifirVeyaBir);
        // Çıktı: "*a*b*b"

        // 15. Belirli semboller (&%$§"?= gibi)
        // "Merhaba! &Java%$#2024?" içindeki semboller (&, %, $, §, ", ?, =) "*" ile değiştirir.
        String ornekSembol = "Merhaba! &Java%$#2024?";
        String sonucSembol = ornekSembol.replaceAll("[&%$§\"?=#]", "*");
        System.out.println("15. Belirli semboller: " + sonucSembol);
        // Çıktı: "Merhaba! *Java***2024*"

        // 16. Emojileri kaldırma
        // "Merhaba 😊, Java 🌟!" içindeki tüm emoji karakterlerini siler.
        String ornekEmoji = "Merhaba 😊, Java 🌟!";
        String sonucEmoji = ornekEmoji.replaceAll("[\\p{So}]", "");
        System.out.println("16. Emojiler: " + sonucEmoji);
        // Çıktı: "Merhaba , Java !"

        // 17. Alt çizgiyi boşlukla değiştirme
        // "Bu_bir_test_cümlesi" içindeki alt çizgileri boşluk ile değiştirir.
        String ornekAltCizgi = "Bu_bir_test_cümlesi";
        String sonucAltCizgi = ornekAltCizgi.replaceAll("_", " ");
        System.out.println("17. Alt çizgi: " + sonucAltCizgi);
        // Çıktı: "Bu bir test cümlesi"




    }
}
