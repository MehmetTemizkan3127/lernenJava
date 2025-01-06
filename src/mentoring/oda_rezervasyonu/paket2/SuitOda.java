package mentoring.oda_rezervasyonu.paket2;

public class SuitOda extends Oda{
    public SuitOda(int odaNumarasi, double fiyat) {
        super(odaNumarasi, fiyat);
    }

    @Override
    public String hizmetler() {
        return "";
    }
}
