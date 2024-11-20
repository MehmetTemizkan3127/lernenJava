package j02_datatypes_wrapperclass;

public class Tasks {
        public static void main(String[] args) {

        // ****************** Task01 ***********************
        /*  Değeri 100 olan bir int oluştur.
            Ve bu int 'i yazdır.      */
        //Kodu aşağıya yazınız.

        int number = 100;
        System.out.println(number);

        // ****************** Task01 ***********************
        /*  Değeri 100 olan bir int oluştur.
            Ve bu int 'i yazdır.      */

        int number1 = 100;               // Değeri 100 olan bir int oluşturuyoruz
        System.out.println(number1);     // int değişkenini yazdırıyoruz


        // ****************** Task02 ***********************
        /*    Değeri 15 olan bir int oluşturun.
           Int'i yazdırın  */
        // Kodu aşağıya yazınız.

        int number2 = 15;
        System.out.println(number2);


        // ****************** Task03 ***********************

        /*    Değeri 120 olan bir int oluşturın.
          Int'i yazdırın.  */
        //Kodu aşağıya yazınız.

        int number3 = 120;
        System.out.println(number3);


        // ****************** Task04 ***********************
         /*   Değeri -6500 olan bir int oluşturunuz.
          Int'i yazdırınız. */
        //Kodu aşağıya yazınız.

        int number4 = -6500;
        System.out.println(number4);


        // ****************** Task01 ***********************
         /*    Değeri 'true' olan bir boolean oluşturunuz.
          Boolean'ı yazdırınız. */
        //Kodu aşağıya yazınız.

        boolean isTrue = true;
        System.out.println(isTrue);


        // ****************** Task02 ***********************
         /*    Değeri 'false' olan bir boolean oluşturunuz.
          Boolean'ı yazdırınız. */
        //Kodu aşağıya yazınız.

        boolean isFalse = false;
        System.out.println(isFalse);


        // ****************** Task01 ***********************
        /*    Değeri 120 olan bir double oluşturunuz.
          Double' ı yazdırınız.  */
        //Kodu aşağıya yazınız.

        double value1 = 120;
        System.out.println(value1);


        // ****************** Task02 ***********************
          /*    Değeri 120.005 olan bir double oluşturunuz.
          Double'ı yazdırınız. */
        //Kodu aşağıya yazınız.

        double value2 = 120.005;
        System.out.println(value2);


        // ****************** Task03 ***********************
          /*    Değeri 10.01 olan bir double oluşturunuz.
          Double'ı yazdırınız.   */
        //Kodu aşağıya yazınız.

        double value3 = 10.01;
        System.out.println(value3);


        // ****************** Task04 ***********************
         /*    Değeri 550.24  olan bir double oluşturunuz.
          Double'ı yazdırınız.  */
        //Kodu aşağıya yazınız.

        double value4 = 550.24;
        System.out.println(value4);


        // ****************** Task01 ***********************
         /*    Değeri 121.005f olan bir float oluşturunuz.
          Float'ı yazdırınız.   */
        //Kodu aşağıya yazınız.

        float f = 121.005f;
        System.out.println(f);


        // ****************** Task02 ***********************
        /*    Değeri 123.3365f olan bir float oluşturunuz.
          Float'ı yazdırınız  */
        //Kodu aşağıya yazınız.

        f = 123.3365f;
        System.out.println(f);


        // ****************** Task03 ***********************
        /*    Değeri 3.55f olan bir float oluşturunuz.
        Float'ı yazdırınız.   */
        //Kodu aşağıya yazınız.

        f = 3.55f;
        System.out.println(f);


        // ****************** Task01 ***********************
         /*    Değeri 12 olan bir short oluşturunuz.
          Short'u yazdırınız.  */
        //Kodu aşağıya yazınız.

        short s1 = 12;
        System.out.println(s1);


        // ****************** Task02 ***********************
          /*    Değeri 23 olan bir short oluşturunuz.
        short s2 = 23;
        System.out.println(s2);


        // ****************** Task03 ***********************
         /*    Değeri -100 olan bir short oluşturun.
          Short'u yazdırın.   */
        //Kodu aşağıya yazınız.

        short s3 = -100;
        System.out.println(s3);


        // ****************** Task01 ***********************
         /*    a olan bir char oluşturun.
          Bu char'ı yazdırın.   */
        //Kodu aşağıya yazınız.

        char c1 = 'a';
        System.out.println(c1);


        // ****************** Task02 ***********************
         /*    z olan bir char oluşturun.
          Bu char'ı yazdırın.   */
        //Kodu aşağıya yazınız.

        char c2 = 'z';
        System.out.println(c2);


        // ****************** Task03 ***********************
            /*    & olan bir char oluşturun.
          Bu char'ı yazdırın.   */
        //Kodu aşağıya yazınız.

        char c3 = '&';
        System.out.println(c3);


        // ****************** Task04 ***********************
            /*    2 olan bir char oluşturun.
          Bu char'ı yazdırın.   */
        //Kodu aşağıya yazınız.

        char c4 = '2';
        System.out.println(c4);


        /*    Değeri 5 olan bir byte oluşturun.
          Bu byte'ı yazdırın.  */
        //Kodu aşağıya yazınız.

        byte b1 = 5;
        System.out.println(b1);


          /*    Değeri -4 olan bir byte oluşturun.
          Bu byte'ı yazdırın.   */
        //Kodu aşağıya yazınız.

        byte b2 = -4;
        System.out.println(b2);

        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplam ve farkını print ediniz

        short s = 15000;
        byte b = 100;
        System.out.println("Toplam: " + (s + b) + ", Fark: " + (s - b));


        //Task -> tamsayı ve ondalıklı sayı tanımlayıp toplam  print ediniz

        int intValiue2 = 12500;
        double doubleValue2 = 12500.15;
        System.out.println("Toplam: " + (intValiue2 + doubleValue2));


        //Task -> tamsayı ve char data type iki variable  tanımlayıp toplam  print ediniz
        int i2 = 15;
        char char1 = 'c';
        System.out.println("Toplam: " + (i2 + char1));


        //Task -> ad ve soyadınızı ve yasınızı print ediniz.

        String name = "Mehmet";
        String surname = "Temizkan";
        int age = 46;
        System.out.println(name + " " + surname + "\n" + age);


        // task02 -> JavaCAN kelimesini her harfini ayrı bir satira gelecek sekilde  print eden code create ediniz.

        System.out.println("J\na\nv\na\nC\nA\nN ");

        // task03 -> "Java" ile hayat cok 'afilli'   çıktısını print eden code create ediniz.

            System.out.println("\"Java\" ile hayat çok 'afilli'");

        // task04 -> "Basari" gayrete'asiktir'  yazdırınız sonraki "Clarusway ile java cok kolay ..."
         // ifadesi  3 satır sonra ve satır basından 1 tab ileride  print eden code create ediniz.
        /*

        System.out.println("Basari gayrete\n'asiktir'\n\n\tClarusway ile java cok kolay ...");


        TASK:
        * Sadece bir tane System.out.println kullanarak Herhangi bir değişken kullanmadan bu işlemleri yapınız.
        * 1. Adım : İsim ve Soy ismiminizi ekrana yazdırın.
         * 2. Adım : Satır atlayarak boyunuzu ekrana yazdırın.
        * 3. Adım : Satır atlayarak kilonu ekrana yazdırın.
        * 4. Adım : Satır atlayarak hobilerinizi ekrana yazdırın.
             OUTPUT :
             Harun Halid
             190
             85
             Yuzme FUTBOL Java
        */
            System.out.println("Harun Halid\n190\n85\nYuzme FUTBOL Java");




         }
        }
