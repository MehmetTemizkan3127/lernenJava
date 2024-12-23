package benimcalismalarim.önceki.homework.lessons;

public class Lesson {
    public String name;
    public int credit;

    public Lesson(String name, int credit) {
        if (credit < 1 || credit > 10) {
            System.out.println("Hata: Kredi 1 ile 10 arasında olmalıdır. Varsayılan olarak kredi 1 atanıyor.");
            this.credit = 1;
        } else {
            this.credit = credit;
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lesson{name='" + name + "', credit=" + credit + '}';
    }
}