package benimcalismalarim.önceki.mentoring.ikincibölüm;

public class M_1101_02_WrapperClass {
    public static void main(String[] args) {
        // double --> byte
        // float --> double
        // char --> int
        // int --> double
        // float --> int

        double doubleSayi = 120.58;
        byte byteSayi = (byte) doubleSayi;
        System.out.println("byteSayi = " + byteSayi);

        float floatSayi = 120.58F;
        double doubleSayi1 = (double) floatSayi;
        System.out.println("doubleSayi1 = " + doubleSayi1);

        char karekter = 'A';
        int AsciiSayi = karekter;
        System.out.println("AsciiSayi = " + AsciiSayi);

        int intSayi = 120;
        double doubleSayi2 = (double) intSayi;
        System.out.println("doubleSayi2 = " + doubleSayi2);

        float floatSayi2 = 120.58F;
        int intSayi1 = (int) floatSayi2;
        System.out.println("intSayi1 = " + intSayi1);
    }
}
