package j101homework.wrapper;

public class Wrapper02 {
    public static void main(String[] args) {
        // ****************** Task01 ***********************
        //Değeri 121.005f olan bir float oluşturunuz. Float'ı yazdırınız.
        float sayi = 121.005f;
        Float wrapperFloat = Float.valueOf(sayi);
        System.out.println("Wrapper Float            = " + wrapperFloat);


        // ****************** Task02 ***********************
        //Değeri 123.3365f olan bir float oluşturunuz. Float'ı yazdırınız
        float sayi1 = 123.3365f;
        Float wrapperFloat1 = Float.valueOf(sayi1);
        System.out.println("Wrapper Float1           = " + wrapperFloat1);


        // ****************** Task03 ***********************
        //Değeri 3.55f olan bir float oluşturunuz. Float'ı yazdırınız.
        float sayi3 = 3.55f;
        Float wrapperFloat3 = Float.valueOf(sayi3);
        System.out.println("Wrapper Float3           = " + wrapperFloat3);

    }
}
