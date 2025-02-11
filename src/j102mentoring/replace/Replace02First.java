    package j102mentoring.replace;

    public class Replace02First {
        public static void main(String[] args) {

            //"abracadabra" ifadesindeki ilk abra kelimesini magic ile değiştirerek elde edilen sonucu yazdırınız.

            String ifade = "abracadabra";
            String yeniIfade = ifade.replaceFirst("abra", "magic");
            System.out.println(yeniIfade);

        }
    }
