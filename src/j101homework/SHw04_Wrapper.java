package j101homework;

public class SHw04_Wrapper {
    public static void main(String[] args) {
        // ****************** Task01 ***********************
        //Değeri 120 olan bir double oluşturunuz. Double' ı yazdırınız.
        double sayi = 120;
        Double sayiDouble = Double.valueOf(sayi);
        System.out.println("Double Wrapper sayi              = " + sayiDouble);


        // ****************** Task02 ***********************
        //Değeri 120.005 olan bir double oluşturunuz. Double'ı yazdırınız.
        double sayi1 = 120.005;
        Double sayiDouble1 = Double.valueOf(sayi1);
        System.out.println("Double Wrapper sayi1             = " + sayiDouble1);


        // ****************** Task03 ***********************
        //Değeri 10.01 olan bir double oluşturunuz. Double'ı yazdırınız.
        double sayi2 = 10.01;
        Double sayiDouble2 = Double.valueOf(sayi2);
        System.out.println("Double Wrapper sayi2             = " + sayiDouble2);


        // ****************** Task04 ***********************
        //Değeri 550.24  olan bir double oluşturunuz. Double'ı yazdırınız.
        double sayi3 = 550.24;
        Double sayiDouble3 = Double.valueOf(sayi3);
        System.out.println("Double Wrapper sayi3             = " + sayiDouble3);

    }
}
