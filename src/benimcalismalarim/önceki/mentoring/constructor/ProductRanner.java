package benimcalismalarim.önceki.mentoring.constructor;

import java.time.LocalDate;

public class ProductRanner {

    int yas;
    double ayakNumarasi;
    String rengi;
    String kumasCinsi;
    LocalDate uretimTarihi;
    boolean yazlikMi;

    @Override
    public String toString() {
        return "CorapConstructor{" +
                "ayakNumarasi=" + ayakNumarasi +
                ", rengi='" + rengi + '\'' +
                ", kumasCinsi='" + kumasCinsi + '\'' +
                ", uretimTarihi=" + uretimTarihi +
                ", yazlikMi=" + yazlikMi +
                ", yas=" + yas +
                '}';
    }

    public ProductRanner(int yas, double ayakNumarasi, String rengi, String kumasCinsi, LocalDate uretimTarihi, boolean yazlikMi) {
        this.yas = yas;
        this.ayakNumarasi = ayakNumarasi;
        this.rengi = rengi;
        this.kumasCinsi = kumasCinsi;
        this.uretimTarihi = uretimTarihi;
        this.yazlikMi = yazlikMi;

    }

    public ProductRanner() {
    }

    public ProductRanner(double ayakNumarasi, String rengi) {
        this.ayakNumarasi = ayakNumarasi;
        this.rengi = rengi;
    }

    public ProductRanner(int yas, double ayakNumarasi, String rengi, LocalDate uretimTarihi) {
        this.yas = yas;
        this.ayakNumarasi = ayakNumarasi;
        this.rengi = rengi;
        this.uretimTarihi = uretimTarihi;
    }

    public ProductRanner(int yas, double ayakNumarasi, String rengi, String kumasCinsi) {
        this.yas = yas;
        this.ayakNumarasi = ayakNumarasi;
        this.rengi = rengi;
        this.kumasCinsi = kumasCinsi;
    }
}

