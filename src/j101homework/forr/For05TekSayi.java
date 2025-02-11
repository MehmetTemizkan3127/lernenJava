package j101homework.forr;

public class For05TekSayi {
    public static void main(String[] args) {
     /* task-> 100'den 0'a kadar bütün tek sayıları print eden code create ediniz.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

        System.out.print("Tek sayılar 100'den 0'a doğru : ");
        for (int i = 99; i > 0; i -= 2) {
            System.out.print(i + " ");
        }
    }
}
