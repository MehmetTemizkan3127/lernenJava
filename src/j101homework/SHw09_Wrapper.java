package j101homework;

public class SHw09_Wrapper {
    public static void main(String[] args) {
        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplam ve farkını print ediniz
        int sayi1 = 20;
        double sayi2 = 15.56;
        double toplam = sayi1+sayi2;
        double fark = sayi1-sayi2;
        System.out.println("1- Iki sayinin toplami         = "+toplam);
        System.out.println(String.format("2- Iki sayinin farki           = %.2f", fark));

        //Task -> tamsayı ve ondalıklı sayı tanımlayıp toplam  print ediniz
        short num1 = 20;
        double num2 = 120.50;
        double toplam1 = num1+num2;
        System.out.println("3- Iki sayinin toplami         = "+toplam1);

        //Task -> tamsayı ve char data type iki variable  tanımlayıp toplam  print ediniz
        int x = 10;
        char y = 'B';
        int sonuc = x+y;
        System.out.println("4- Sonuc                       = " + sonuc);

        //Task -> ad ve soyadınızı ve yasınızı print ediniz.
        String adSoyad = "Salih Uygan";
        int yas = 37;
        System.out.println("5- Adi Soyadi                  = "+adSoyad +" ===>  Yas    = "  + yas);

        // task02 -> JavaCAN kelimesini her harfini ayrı bir satira gelecek sekilde  print eden code create ediniz.
        String kelime = "JavaCAN";
        int i = 0;
        System.out.println("JavaCAN Stringinin altalta gelecek sekilde yazilimi;");
        for (char harf : kelime.toCharArray()){
            i++;
            System.out.println(i+". harf = " + harf);
        }
        // task03 -> "Java" ile hayat cok 'afilli'   çıktısını print eden code create ediniz.
        System.out.println("\"Java\" ile hayat cok 'afilli'");
        // task04 -> "Basari" gayrete
        // 'asiktir'  yazdırınız sonraki "Clarusway ile java cok kolay ..."
        // ifadesi  3 satır sonra ve satır basından 1 tab ileride  print eden code create ediniz.
        System.out.println("\"Basari\" gayrete 'asiktir'");
        System.out.println("\n\n\n");
        System.out.println("\tClarusway ile java cok kolay ...");

        /*//TASK:/*Sadece bir tane System.out.println kullanarak Herhangi bir değişken kullanmadan bu işlemleri yapınız.
        //1. Adım : İsim ve Soy ismiminizi ekrana yazdırın.
        //2. Adım : Satır atlayarak boyunuzu ekrana yazdırın.
        //3. Adım : Satır atlayarak kilonu ekrana yazdırın.
        //4. Adım : Satır atlayarak hobilerinizi ekrana yazdırın.
             OUTPUT :
             Harun Halid
             190
             85
             Yuzme FUTBOL Java*/
        String nameVorname = "Harun Halid ";
        System.out.println("Ad ve Soyadiniz   = "+nameVorname);
        int boy = 190;
        System.out.println("\nBoyunuz           = " + boy);
        int kilo = 85;
        System.out.println("\nKilonuz           = " + kilo);
        String hobiler = "Yuzme FUTBOL Java";
        System.out.println("\nHobileriniz       = " + hobiler);
    }
}
