package j101homework.homework;

public class NestedFor01AsciiDeger {
    public static void main(String[] args) {

/*
A               //1. satıra 1 harf
A B             //2. satıra 2 harf
A B C           //3. satıra 3 harf
A B C D
A B C D E
A B C D E F
şekli print eden code create ediniz.  65=A'nın ascıı değeri
*/
        int satirSayisi = 6;

        for (int i = 1; i <= satirSayisi; i++){
            for (int j = 0; j < i; j++){
                System.out.print((char) (65+j)+ " ");
            }
            System.out.println();
        }
    }

}
