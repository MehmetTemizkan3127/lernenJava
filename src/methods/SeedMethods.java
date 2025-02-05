package methods;

public class SeedMethods {
    public static <T> void println(T element) {
        System.out.println(element+ " ");
    }

    public static <T> void print(T element) {
        System.out.print(element+ " ");
    }

    public static int bolunenleriCarp(int a, int b ){
        return a * b;
    }

    public static <T> boolean ciftMi(double element) {
        //System.out.println("Liste : " + element+ " ");
        return element % 1 == 0 && ((int) element) % 2 == 0; // Tam sayı ve çift mi?
    }

    public static <T> int karesiniAl(int element) {
        //System.out.println("Liste : " + element+ " ");
        return element * element;
    }

    public static double karekokAl(double element) {
        return Math.sqrt(element);
    }

    public static Integer maxBul(Integer a, Integer b) {
        return Math.max(a, b);
    }

    public static int ekle(double element){
        return (int) (element+3);
    }

    public static int cikar(double element){
        return (int) (element-7);
    }

    public static int rastgeleSayiEkle() {
        return (int) (Math.random() * 10) + 1;
    }



}
