package mentoring.oda_rezervasyonu.paket2;

public class StandartOda extends Oda{
    public StandartOda(int odaNumarasi, double fiyat) {
        super(odaNumarasi, fiyat);
    }

    @Override
    public String hizmetler() {
        return "";
    }
}
