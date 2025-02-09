package j102mentoring.replace;

public class M_1030_05_ReplaceAll {
    public static void main(String[] args) {
        //Bir cümledeki tüm sayıları # sembolüyle değiştirin.
        // Senaryo: Bir metinde, gizlilik için telefon numarası veya yaş gibi bilgileri gizleyin.
        // Örneğin, "Ali 25 yaşında ve telefon numarası 0555-123-4567." cümlesindeki tüm sayıları gizleyin.

        String cumle = "Ali 25 yaşında ve telefon numarası 0555-123-4567.";

        String gizliCumle = cumle.replaceAll("\\d", "#");
        System.out.println("Gizli Cümle : " +gizliCumle);
    }
}
