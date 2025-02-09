package javacalismalarim.projelerimiz.odakiralama;

public class OdaTest {
    public static void main(String[] args) {

        Oda standartOda = new StandartOda(101, 300);
        Oda deluxeOda = new DeluxeOda(102, 500);
        Oda suitOda = new Oda(103, 1000) {
            @Override
            public String hizmetler() {
                return "";
            }
        };


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






