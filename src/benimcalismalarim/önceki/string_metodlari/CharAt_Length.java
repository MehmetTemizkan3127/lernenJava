package benimcalismalarim.önceki.string_metodlari;

public class CharAt_Length {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //System.out.println("Bir cümle giriniz : ");
        //String cumle = input.nextLine();
        String cumle = "Ali javayi seviyor";

        int uzunluk = cumle.length()-1;
        System.out.println("uzunluk = " + uzunluk);

        char ilkKarekter = cumle.charAt(0);
        System.out.println("ilkKarekter = " + ilkKarekter);

        char ortaKarekter = cumle.charAt(uzunluk/2);
        System.out.println("ortaKarekter = " + ortaKarekter);

        char sonKarekter = cumle.charAt(uzunluk-1);
        System.out.println("sonKarekter = " + sonKarekter);

        System.out.println("J harfi " +cumle.indexOf('j')+". indekstir" );

        System.out.println("4. indeks "+cumle.charAt(4) + ". karekterdir" );

        System.out.println("4. indeks "+cumle.substring(4,5)+". karekterdir");


        System.out.println("Son indeks: " + (cumle.length() - 1));

        System.out.println("Orta indeks: " + (cumle.length() / 2));
    }
}
