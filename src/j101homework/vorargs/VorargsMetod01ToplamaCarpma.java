package j101homework.vorargs;

public class VorargsMetod01ToplamaCarpma {
    public static void main(String[] args) {
     /*
        Task -> Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
         */
        int sonuc = toplamaVeCarpma(5,3,2);
        System.out.println("Sonuc : " + sonuc);
    }

    public static int toplamaVeCarpma(int... numbers) {

        int toplam = 0;
        for (int number : numbers) {
            toplam += number;
        }
        return numbers[0] * (toplam - numbers[0]);
    }
}
