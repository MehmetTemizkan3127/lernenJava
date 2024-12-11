package benimcalismalarim.mentoring.dersyonetimsistemi;

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
