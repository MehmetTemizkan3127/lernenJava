    package benimcalismalarim.önceki.mentoring.replace;

    public class M_1030_03_ReplaceFirst {
        public static void main(String[] args) {

            //"abracadabra" ifadesindeki ilk abra kelimesini magic ile değiştirerek elde edilen sonucu yazdırınız.

            String ifade = "abracadabra";
            String yeniIfade = ifade.replaceFirst("abra", "magic");
            System.out.println(yeniIfade);

        }
    }
