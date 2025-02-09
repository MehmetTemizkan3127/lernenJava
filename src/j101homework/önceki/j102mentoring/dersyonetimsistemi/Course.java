package j101homework.önceki.j102mentoring.dersyonetimsistemi;

public class Course {
    String dersAdi;
    int dersKrediSayisi;

    @Override
    public String toString() {
        return "Course{" +
                "dersKrediSayisi=" + dersKrediSayisi +
                ", dersAdi='" + dersAdi + '\'' +
                '}';
    }

    public Course (String dersAdi, int dersKrediSayisi) {
        this.dersAdi = dersAdi;
        this.dersKrediSayisi = dersKrediSayisi;
    }
}
