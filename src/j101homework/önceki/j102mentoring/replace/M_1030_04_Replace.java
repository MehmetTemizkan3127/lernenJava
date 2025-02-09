package j101homework.önceki.j102mentoring.replace;

public class M_1030_04_Replace {
    public static void main(String[] args) {
        String ifade = "The quick brown fox jumps over the lazy dog";
        //"The quick brown fox jumps over the lazy dog" ifadesindeki tüm "o" harflerini "0"
        // ve "e" harflerini "3" ile değiştirip sonucu yazdıran bir kod yazınız.

        String yeniIfade = ifade.replace("o", "0").replace("e", "3");

        System.out.println(yeniIfade);
    }
}
