package benimcalismalarim.önceki.mentoring.replace;

public class M_1030_01_Replace {
    public static void main(String[] args) {
        // "Welcome to the world of programming!" ifadesindeki "world" kelimesini "universe" ile değiştiren bir kod yazınız.

        String cumle = "Welcome to the world of programming!";
        String guncelCumle = cumle.replace("world", "universe");
        System.out.println("Güncel Cümle : " +guncelCumle);
    }
}
