package benimcalismalarim.sablonlar;

public class StringKonusuKelimeleriYanYanaYazdirma {
    public static <Stzring> void main(String[] args) {
        String str1 = "Merhaba ";
        String str2 = "Dünya!";
        String str3 = str1 + str2;
        System.out.println("" + str3);

        //1.Yol Concat
        System.out.println(str1.concat(str2));

        //2.Yol Concat
        StringBuilder sb = new StringBuilder("Merhaba");

        //3.Yol Concat
        sb.append(" Dünya");
        sb.append(" nasilsin");
        sb.append(" iyimisin");
        sb.append("!");
        System.out.println(sb.toString());
    }
}
