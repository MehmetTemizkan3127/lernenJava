package mentoring.oda_rezervasyonu.paket2;

public class DeluxeOda extends Oda{
    public DeluxeOda(int odaNumarasi, double fiyat) {
        super(odaNumarasi, fiyat);
    }

    @Override
    public String hizmetler() {
        return "";
    }
}
