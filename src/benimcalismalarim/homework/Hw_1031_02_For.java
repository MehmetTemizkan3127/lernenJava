package benimcalismalarim.homework;

public class Hw_1031_02_For {
    public static void main(String[] args) {
        //  Task->  0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

        int baslangic = 0;
        int bitis = 100;

        System.out.print(baslangic + " ile " + bitis + " arasındaki çift sayılar: ");

        if (baslangic % 2 != 0) {baslangic++;
        }
        for (int i = baslangic+2; i < bitis; i += 2) {
            System.out.print(i + " ");
        }
    }
}
