package j101homework.consructor03lessons;

public class Runner {
    public static void main(String[] args) {
        Lesson matematik = new Lesson("Matematik", 4);
        Lesson fizik = new Lesson("Fizik", 5);
        Lesson kimya = new Lesson("Kimya", 11);


        Student ogrenci = new Student("Ahmet", 10);


        System.out.println(ogrenci.name + " ögrencisi icin ders ekleniyor (Maksimum Kredi: " + ogrenci.maxCredit + ")\n");

        if (ogrenci.dersEkle(matematik)) {
            System.out.println("Eklendi: " + matematik);
        }

        if (ogrenci.dersEkle(fizik)) {
            System.out.println("Eklendi: " + fizik);
        }

        if (ogrenci.dersEkle(kimya)) {
            System.out.println("Eklendi: " + kimya);
        }

        System.out.println("\n" + ogrenci.name + " öğrencisinin ders listesi:");
        ogrenci.dersleri.forEach(System.out::println);
        System.out.println("Toplam Kredi: " + ogrenci.toplamKredisi());
    }
}