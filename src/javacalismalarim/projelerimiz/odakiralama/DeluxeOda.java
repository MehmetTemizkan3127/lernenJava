package javacalismalarim.projelerimiz.odakiralama;

public class DeluxeOda extends Oda{
    public DeluxeOda(int odaNumarasi, double fiyat) {
        super(odaNumarasi, fiyat);
    }

    @Override
    public String hizmetler() {
        return "";
    }
}
