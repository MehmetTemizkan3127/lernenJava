package benimcalismalarim.mentoring.constructor;

import java.time.LocalDate;

public class CoropImalati {
    public static void main(String[] args) {
        Product corap = new Product(18, 40.5, "Siyah", "Pamuklu", LocalDate.of(2024, 12, 04), false);
        System.out.println("corap = " + corap);

        // Product corap2 = new Product(30.5,"Beyaz", 30);

        Product corap2 = new Product(28.5, "Sari");
        System.out.println("corap2 = " + corap2);

        Product corap3 = new Product();
        corap3.rengi = "siyah";
        corap3.kumasCinsi = "pamuklu";
        System.out.println("corap3 = " + corap3);

        Product corap4 = new Product(30,28.5,null, LocalDate.of(2024, 10, 15));
        System.out.println("corap4 = " + corap4);




        Product corap5 = new Product(18, 34.5, "Gri","Pamuklu", null,false);
        System.out.println("corap5 = " + corap5);
    }

}
