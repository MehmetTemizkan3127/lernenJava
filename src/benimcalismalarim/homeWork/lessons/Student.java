package benimcalismalarim.homeWork.lessons;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public int maxCredit;
    public List<Lesson> dersleri;

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
        this.dersleri = new ArrayList<>();
    }

    public boolean dersEkle(Lesson lesson) {
        int toplamKredi = toplamKredisi();
        if (toplamKredi + lesson.credit <= maxCredit) {
            dersleri.add(lesson);
            return true;
        }
        System.out.println("Uyarı: " + lesson.name + " dersi eklenemedi. Maksimum kredi limiti asiliyor.");
        return false;
    }

    public int toplamKredisi() {
        return dersleri.stream().mapToInt(d -> d.credit).sum();
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', maxCredit=" + maxCredit + ", dersleri=" + dersleri + '}';
    }
}