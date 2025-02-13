package javacalismalarim.konutekrari.constructor.ogrenci;

/*Task: Öğrenci Takip Sistemi
Senaryo:
Bir okulda öğrenci takibi yapmak amacıyla bir sistem geliştireceksin.
Öğrencilerin bilgileri (sınıf, numara, ders, not, öğretmen adı) saklanacak ve
her öğrenci için "geçti mi" durumu belirlenecek.

Öğrenci Sınıfı:

Öğrenci sınıfı içerisinde aşağıdaki özellikler olmalıdır:
sinif (int) – Öğrencinin sınıfı.
numara (int) – Öğrencinin okul numarası.
sinifHocasi (String) – Öğrencinin sınıf hocasının adı.
ders (String) – Öğrencinin aldığı ders.
not (int) – Öğrencinin aldığı sınav notu.
gectiMi (boolean) – Öğrencinin geçip geçmediğini belirten durum (50 ve üzeri geçer).
 */
public class Ogrenci {

    public String isim;
    // Öğrenci bilgileri
    int sinif;
    int numara;
    String sinifHocasi;
    String ders;
    int not;
    boolean durumu;

    // Boş Constructor (Varsayılan değerlerle)
    public Ogrenci() {
        this.sinif = 0;
        this.numara = 0;
        this.sinifHocasi = "Bilinmiyor";
        this.ders = "Bilinmiyor";
        this.not = 0;
        this.durumu = false;
    }

    // Parametreli Constructor
    public Ogrenci(int sinif, int numara, String sinifHocasi, String ders, int not, boolean durumu) {
        this.sinif = sinif;
        this.numara = numara;
        this.sinifHocasi = sinifHocasi;
        this.ders = ders;
        this.not = not;
        this.durumu = durumu;
    }

    // Parametreli Constructor (String parametreler ile)
    public Ogrenci(String sinif, String numara, String ders, int not) {
        this.sinif = Integer.parseInt(sinif); // String'ten int'e dönüştürülüyor
        this.numara = Integer.parseInt(numara); // String'ten int'e dönüştürülüyor
        this.ders = ders;
        this.not = not;
        this.durumu = not >= 50;  // 50 ve üzeri geçiyor
        this.sinifHocasi = "Bilinmiyor"; // Varsayılan hocası
    }

    public Ogrenci(String ali) {
    }

    // not güncelleme ve geçme durumu kontrol etme
    public void notGuncelle(int yeniNot) {
        this.not = yeniNot;
        this.durumu = yeniNot >= 50; // Eğer not 50 veya daha fazla ise geçti kabul edilir
    }

    // Öğrenci bilgilerini döndüren toString metodu
    @Override
    public String toString() {
        return "Ogrenci{" +
                "sinif=" + sinif +
                ", numara=" + numara +
                ", sinifHocasi='" + sinifHocasi + '\'' +
                ", ders='" + ders + '\'' +
                ", not=" + not +
                ", gectiMi=" + durumu +
                '}';
    }

    // Getter ve Setter metotları
    public boolean isGectiMi() {
        return durumu;
    }

    public void setGectiMi(boolean gectiMi) {
        this.durumu = gectiMi;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public String getSinifHocasi() {
        return sinifHocasi;
    }

    public void setSinifHocasi(String sinifHocasi) {
        this.sinifHocasi = sinifHocasi;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }
}