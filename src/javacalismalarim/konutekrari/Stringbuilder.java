package javacalismalarim.konutekrari;

public class Stringbuilder {
    public Stringbuilder(String meyve) {
    }

    public static void main(String[] args) {

        StringBuilder adSoyad = new StringBuilder();
        adSoyad.append("Mehmet Temizkan");
        System.out.println("adSoyad         = " + adSoyad);
        System.out.println("reverse         = " + adSoyad.reverse());
        System.out.println("insert          = " + adSoyad.insert(13, 'e'));
        System.out.println("insert          = " + adSoyad.insert(8, " "));
        System.out.println("replace         = " + adSoyad.replace(14, 15, ""));
        System.out.println("replace         = " + adSoyad.replace(8, 9, ""));

        System.out.println("reverse         = " + adSoyad.reverse());


        StringBuilder orjinalAd = new StringBuilder(adSoyad.replace(7, 15, "Kaya"));
        System.out.println("replace         = " + orjinalAd);
        orjinalAd.insert(11, " Adanali");
        System.out.println("insert          = " + orjinalAd);
        System.out.println("deleteCharAt    = " +orjinalAd.deleteCharAt(15));
        System.out.println("insert          = " +orjinalAd.insert(15, "n"));
        System.out.println("delete          = " +orjinalAd.delete(11,19));
        orjinalAd.setCharAt(7, 'T');
        System.out.println("setCharAt       = " + orjinalAd);
        System.out.println("length          = " +orjinalAd.length());
        orjinalAd.ensureCapacity(60);
        System.out.println("capacity        = " + adSoyad.capacity());

        System.out.print("substring         = " +orjinalAd.substring(7));
        System.out.println(" "+orjinalAd.substring(0,6));

        System.out.println("substring       = "+ orjinalAd.substring(0,6)+" " +orjinalAd.substring(7).toUpperCase());

        StringBuilder cumle = new StringBuilder();
        cumle.append("Ya sev ya terket ya kal ya");
        System.out.println("indexOf         = " +cumle.indexOf("ya"));
        System.out.println("indexOf         = " +cumle.indexOf("ya",8));
        System.out.println("lastIndexOf     = " +cumle.lastIndexOf("ya"));





    }

    public String reverse() {
        return null;
    }
}
