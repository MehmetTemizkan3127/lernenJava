package j102mentoring.replace;

public class ReplaceAll04 {
    public static void main(String[] args) {
        //Bir cümledeki tüm sayıları # sembolüyle değiştirin.
        // Senaryo: Bir metinde, gizlilik için telefon numarası veya yaş gibi bilgileri gizleyin.
        // Örneğin, "Ali 25 yaşında ve telefon numarası 0555-123-4567." cümlesindeki tüm sayıları gizleyin.

        String cumle = "Ali 25 yaşında ve telefon numarası 0555-123-4567.";

        String gizliCumle = cumle.replaceAll("\\d", "#");
        System.out.println("Gizli Cümle : " +gizliCumle);
    }
}
