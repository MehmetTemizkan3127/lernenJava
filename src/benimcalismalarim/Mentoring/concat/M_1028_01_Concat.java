package benimcalismalarim.Mentoring.concat;

import java.util.Scanner;

public class M_1028_01_Concat {
    public static void main(String[] args) {
        // Kullanıcıdan ad ve soyadını ayrı ayrı alalım.
// Yanyana yazdıralım. concat() kullanalım.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz : ");
        String ad = input.nextLine();

        System.out.println("Lütfen soyadinizi giriniz : ");
        String soyad = input.nextLine();
        System.out.println("Adiniz ve Soyadiniz :" + ad.toUpperCase().concat(" ").concat(soyad.toUpperCase()));

        // Bir dosyanın adını ve uzantısını ayrı ayrı alın ve concat() metodunu kullanarak tam dosya adını oluşturun.
        // Örneğin, "Ödev" dosya adını ve ".pdf" uzantısını birleştirerek tam dosya adı oluşturun.

        System.out.println("Lütfen dosya adını giriniz (uzantı olmadan): ");
        String dosyaAdi = input.nextLine();

        System.out.println("Lütfen dosya uzantısını giriniz (örnegin: .pdf): ");
        String uzanti = input.nextLine();

        System.out.println("Tam dosya adı: " + dosyaAdi.concat(".").concat(uzanti));

        // Bir sosyal medya platformuna kullanıcı adı kaydediyorsunuz.
        // Kullanıcı adlarının uzunluğunun en az 5, en fazla 15 karakter olması gerekiyor.
        // Kullanıcıdan bir kullanıcı adı alın ve length() metodunu kullanarak bu kurallara uyup uymadığını kontrol edin.
        // uuyorsa --> "Kullanıcı adı geçerli."
        // uymuyorsa --> "Kullanıcı adı geçersiz. 5 ile 15 karakter arasında olmalıdır."


        System.out.print("Bir kullanici adi girin: ");
        String kullaniciAdi = input.nextLine();

        if (kullaniciAdi.toUpperCase().length() >= 5 && kullaniciAdi.length() <= 15) {
            System.out.println("Kullanıcı adı geçerli.".concat(" Hos geldiniz!"));
        } else {

        }
    }
}
