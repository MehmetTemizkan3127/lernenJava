package mentoring.oda_rezervasyonu.paket2;

public class OdaTest {
    public static void main(String[] args) {

        Oda standartOda = new StandartOda(101, 300);
        Oda deluxeOda = new DeluxeOda(102, 500);
        Oda suitOda = new SuitOda(103, 1000);


        yazdirOdaBilgileri(standartOda);
        yazdirOdaBilgileri(deluxeOda);
        yazdirOdaBilgileri(suitOda);
    }

    public static void yazdirOdaBilgileri(Oda oda) {
        System.out.println(oda.odaBilgileri());
        System.out.println(oda.hizmetler());
        System.out.println("-----------------------------");


    }
}






