package j101homework.homework;

public class NestedFor03SayiUcgenSekil {
    public static void main(String[] args) {

//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.

        int satirSayisi = 5;
        int sayi;

        for (int i = 1; i <= satirSayisi; i++) {
            sayi = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(sayi + " ");
                sayi = sayi + (satirSayisi - j);
            }
            System.out.println();
        }
    }
}
