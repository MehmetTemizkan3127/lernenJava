package javacalismalarim.sinavhazirliklari;

public class StringTerstenYazdirma {
    public static void main(String[] args) {

        String meyve = "Kiraz";
        StringBuilder sb = new StringBuilder(meyve);
        System.out.println("Sb ile tersten yazdirma                 = " + sb.reverse());

        String tersMeyve = "";
        for (int i = meyve.length()-1; i >= 0; i--){
            tersMeyve += meyve.charAt(i);
        }
        System.out.println("For ile String'i ntersten yazdirma      = "+tersMeyve);
    }
}
