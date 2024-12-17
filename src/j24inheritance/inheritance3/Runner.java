package j24inheritance.inheritance3;



public class Runner {

    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        System.out.println("h1.m = " + h1.m); // 3

        Memeli m1 = new Memeli();
        System.out.println("m1.m = " + m1.m); // 1

        Kedi k1 = new Kedi();
        System.out.println("k1.c = " + k1.c); // 2
        System.out.println("k1.a = " + k1.a);// 0;
        System.out.println("k1.m = " + k1.m); // 1
        System.out.println("k1.m = " + k1.d); // 7

        System.out.println("**************** String Kedi *************");
        Kedi k2 = new Kedi("Pamuk");


    }

}
