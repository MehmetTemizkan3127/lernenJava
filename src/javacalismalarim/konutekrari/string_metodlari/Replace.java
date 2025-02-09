package javacalismalarim.konutekrari.string_metodlari;

public class Replace {
    public static void main(String[] args) {
        String tutar1 = "$12.21";
        String tutar2 = "$23.42";
        double doubleTutar1 = Double.parseDouble(tutar1.replace("$", ""));
        System.out.println("DoubleTutar1 = $" + doubleTutar1);

        double doubleTutar2 = Double.parseDouble(tutar2.replace("$", ""));
        System.out.println("DoubleTutar2 = $" + doubleTutar2);

        System.out.println("Total DTutar = $" +(doubleTutar1 + doubleTutar2));







    }
}
