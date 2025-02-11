package j102mentoring.replace;

public class Replace01 {
    public static void main(String[] args) {
        //"banana" kelimesindeki n harflerinin yerine m harfini koyarak yeni kelimeyi yazdıran bir kod yazınız.

        String kelime = "banana";
        String yeniKelime = kelime.replace("n", "m");
        System.out.println(yeniKelime);
    }
}
