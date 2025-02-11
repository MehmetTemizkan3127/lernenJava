package j102mentoring.string.concat;

import java.util.Scanner;

public class Concat02 {
    public static void main(String[] args) {
        // Bir sosyal medya platformuna kullanıcı adı kaydediyorsunuz.
        // Kullanıcı adlarının uzunluğunun en az 5, en fazla 15 karakter olması gerekiyor.
        // Kullanıcıdan bir kullanıcı adı alın ve length() metodunu kullanarak bu kurallara uyup uymadığını kontrol edin.
        // uuyorsa --> "Kullanıcı adı geçerli."
        // uymuyorsa --> "Kullanıcı adı geçersiz. 5 ile 15 karakter arasında olmalıdır."

        Scanner input = new Scanner(System.in);
        System.out.print("Bir kullanici adi girin: ");
        String kullaniciAdi = input.nextLine();

        if (kullaniciAdi.toUpperCase().length() >= 5 && kullaniciAdi.length() <= 15) {
            System.out.println("Kullanici adi geçerli.".concat(" Hos geldiniz!"));
        } else {
            System.out.println("Kullanıcı adi gecersiz.".concat(" 5 ile 15 karakter arasinda olmalidir."));
        }




        String durum = (kullaniciAdi.toUpperCase().length() >= 5 && kullaniciAdi.length() <= 15) ?
                "Kullanıcı adi gecersiz.".concat(" Hos geldiniz!")
                : "Kullanıcı adı geçersiz.".concat(" 5 ile 15 karakter arasinda olmalidir.");

        System.out.println(durum);


    }
}
