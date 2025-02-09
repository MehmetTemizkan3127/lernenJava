package j101homework;

public class SHw03 {
    public static void main(String[] args) {
        // ****************** Task01 ***********************
        //Değeri 'true' olan bir boolean oluşturunuz. Boolean'ı yazdırınız.
        int num = 5;
        boolean pozitifMi;

        if (num > 0) {
            pozitifMi = true;
        } else {
            pozitifMi = false;
        }
        System.out.println("Boolean sonucu          = " + pozitifMi);


        // ****************** Task02 ***********************
        //Değer i 'false' olan bir boolean oluşturunuz. Boolean'ı yazdırınız.
        int yas = 17;
        boolean resitMi;

        if (yas > 18) {
            resitMi = true;
        } else {
            resitMi = false;
        }
        System.out.println("Boolean sonucu          = " + resitMi);
    }
}
