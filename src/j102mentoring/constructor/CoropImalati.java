package j102mentoring.constructor;

import java.time.LocalDate;

public class CoropImalati {
    public static void main(String[] args) {
        ProductRanner corap = new ProductRanner(18, 40.5, "Siyah", "Pamuklu", LocalDate.of(2024, 12, 04), false);
        System.out.println("corap = " + corap);

        // Product corap2 = new Product(30.5,"Beyaz", 30);

        ProductRanner corap2 = new ProductRanner(28.5, "Sari");
        System.out.println("corap2 = " + corap2);

        ProductRanner corap3 = new ProductRanner();
        corap3.rengi = "siyah";
        corap3.kumasCinsi = "pamuklu";
        System.out.println("corap3 = " + corap3);

        ProductRanner corap4 = new ProductRanner(30,28.5,null, LocalDate.of(2024, 10, 15));
        System.out.println("corap4 = " + corap4);




        ProductRanner corap5 = new ProductRanner(18, 34.5, "Gri","Pamuklu", null,false);
        System.out.println("corap5 = " + corap5);
    }

}
