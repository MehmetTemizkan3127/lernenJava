package javacalismalarim.projelerimiz.odakiralama;

public class StandartOda extends Oda{
    public StandartOda(int odaNumarasi, double fiyat) {
        super(odaNumarasi, fiyat);
    }

    @Override
    public String hizmetler() {
        return "";
    }
}
