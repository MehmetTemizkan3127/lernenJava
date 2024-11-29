package benimcalismalarim.homeWork;

public class Hw_1129_01_DateTimeNano {
    public static void main(String[] args) {
        /*Task :
        Bir for döngüsü oluşturun.
        Döngüde, herhangi bir işlem yapabilirsiniz.
        Döngünün başlamasından hemen önce zamanı alın
        Döngü tamamlandıktan sonra tekrar zamanı alın.
        Döngünün çalışma süresini hesaplayarak kullanıcıya yazdırın.
        */
        // 1'den 10'a kadar olan sayıları topla
        int toplam = 0;

        long baslangicZamani = System.nanoTime();
        for (int i = 1; i <= 10; i++) {
            toplam += i;
        }
        long bitisZamani = System.nanoTime();

        long gecenSure = bitisZamani - baslangicZamani;
        System.out.println("Döngü calisma süresi : " + gecenSure + " nanisaniye");
    }
}

