        package j03_scannerclass_typecasting;

        import java.util.Scanner;

        public class Hw_06Hipotenus {
        public static void main(String[] args) {



         /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        hipotenus=birinciKenar*birinciKenar+ikinciKenar*ikincikenar karekoku
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */




        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci dik kenarı girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci dik kenarı girin: ");
        double kenar2 = scanner.nextDouble();

        double hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.printf("Hipotenüs: %.1f%n", hipotenus);



    }
}
