package benimcalismalarim.önceki.homework;


public class Hw_1110_01_Breack_Continue {
    public static void main(String[] args) {
      /*
Task:  1’den 20’ye kadar olan sayıları yazdır. Ancak, sayılar 15’ten büyük
 olduğunda döngüyü sonlandır (break kullan). Çift sayıları ise atla (continue kullan).
 */
        int i;

        for (i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
