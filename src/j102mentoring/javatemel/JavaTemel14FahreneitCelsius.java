package j102mentoring.javatemel;

import java.util.Scanner;

public class JavaTemel14FahreneitCelsius {
    public static void main(String[] args) {

    /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */

    Scanner scn = new Scanner(System.in);
        System.out.print("Lütfen Fahrenheit cinsinden sıcaklığı girin: ");
        double fahrenheit = scn.nextDouble();

        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Fahreneiten Celsius degeri = " + celsius);









    }
}
