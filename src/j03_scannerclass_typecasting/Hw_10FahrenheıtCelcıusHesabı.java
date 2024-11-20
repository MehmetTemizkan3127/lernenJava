    package j03_scannerclass_typecasting;

    import java.util.Scanner;

    public class Hw_10FahrenheıtCelcıusHesabı {

    public static void main(String[] args) {

        // ************************** Task 10 ***********************************
            /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit cinsinden sıcaklığı girin: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Celsius cinsinden sıcaklık: %.1f%n", celsius);




















    }
}
