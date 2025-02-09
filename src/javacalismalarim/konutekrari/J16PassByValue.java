package javacalismalarim.konutekrari;

public class J16PassByValue {
    /*
    16- Pass By Value (Değerle Geçiş)
Tanım:
Java'da, tüm parametreler değerle (pass by value) geçer. Bu, parametrelerin kopyalarının metotlara gönderildiği anlamına gelir. Yani, bir metot içerisindeki parametrelerde yapılan değişiklikler, orijinal veriyi etkilemez.

Örnek:
java
Kodu kopyala
public class PassByValueExample {
    public static void modifyValue(int num) {
        num = 10;
    }

    public static void main(String[] args) {
        int x = 5;
        modifyValue(x);
        System.out.println(x); // Çıktı: 5, çünkü x'in kopyası metota geçer
    }
}
Referans Tipleri ve Değerle Geçiş:
Eğer primitive (ilkel) bir tip kullanıyorsanız, parametre değeri kopyalanır.
Eğer object (referans) tiplerinde bir parametre kullanıyorsanız, nesne kopyalanmaz, referans kopyalanır, ancak nesnenin kendisi üzerinde yapılan değişiklikler dışarıya yansımaz.
java
Kodu kopyala
public class PassByReferenceExample {
    public static void modifyArray(int[] arr) {
        arr[0] = 100; // Referans tip olduğu için değişiklik yapılır.
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        modifyArray(array);
        System.out.println(array[0]); // Çıktı: 100
    }
}
Önemli Not:
Primitive tiplerde yapılan değişiklikler orijinal değişkene yansımaz, çünkü kopyası metota geçmiştir.
Referans tiplerde nesne üzerinde yapılan değişiklikler nesneyi etkiler, ancak nesne referansının kendisi değiştirilemez.
Konu Özeti:
Java'da tüm parametreler değerle (pass by value) geçer.
Referans tiplerde, nesne üzerinde değişiklik yapılabilir, ancak referans değiştirilmez.
     */
}
