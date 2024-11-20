    package j03_scannerclass_typecasting;

    import java.util.Scanner;

    public class Hw_03UykuHesabi {
    public static void main(String[] args) {

        // ************************** Task 03 ***********************************
            /*
         TASK->
         Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print eden code create ediniz
         Ornek : Input : 8
                 Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
            */

        Scanner scn = new Scanner(System.in);

        System.out.print("Günde kac saat uyuyorsunuz?: ");
        int uykuSaati = scn.nextInt();
        int aydaGecirilenGun = 30 * (int) uykuSaati / 24;
        int yildaGecirilenGun = 365 * (int) uykuSaati / 24;
        int kirkYildaGecirilenGun = 365 * 40 * (int) uykuSaati / 24;

        System.out.println("Ayda uykuda geçen gün: " + aydaGecirilenGun);
        System.out.println("Yılda uykuda geçen gün: " + yildaGecirilenGun);
        System.out.println("40 yılda uykuda geçen gün: " + kirkYildaGecirilenGun);




    }
}
