package j101homework;

public class SHw06_Wrapper {
    public static void main(String[] args) {
        // ****************** Task01 ***********************
        //Değeri 12 olan bir short oluşturunuz. Short'u yazdırınız.
        short sayi = 12;
        Short wrapperShort = Short.valueOf(sayi);
        System.out.println("Wrapper Short          = " + wrapperShort);


        // ****************** Task02 ***********************
        //Değeri 23 olan bir short oluşturunuz. Short'u yazdırınız.
        short sayi1 = 23;
        Short wrapperShort1 = Short.valueOf(sayi1);
        System.out.println("Wrapper Short1         = " + wrapperShort1);


        // ****************** Task03 ***********************
        // Değeri -100 olan bir short oluşturun. Short'u yazdırın.
        short sayi2 = -100;
        Short wrapperShort2 = Short.valueOf(sayi2);
        System.out.println("Wrapper Short2         = " + wrapperShort2);

    }
}
