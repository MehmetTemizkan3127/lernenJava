package j101homework.önceki.j102mentoring.soncalismalarim;

public class M_1029_07_SubstringHataliKelimeDegistirme {
    public static void main(String[] args) {
/*  Elinizde bir cümle var, ancak bu cümlede bir hata var.
    Mesela "Merhaba Dünya" ifadesinde "Dünya" kelimesini "Evren" ile değiştirmek istiyorsunuz.
    Hatalı kısmı substring() ile bulun, concat() ile yeni kısmı ekleyin ve sonucu yazdırın.
 */
        String cumle = "Merhaba Dünya";
        String kelime = " Evren";

        String hataliKelime = cumle.substring(8, 12);
        String yeniCumle = cumle.substring(0, 7).concat(kelime);

        System.out.println("Cümlenin düzeltilmis hali = " + yeniCumle);
    }
}
