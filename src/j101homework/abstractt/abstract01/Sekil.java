package j101homework.abstractt.abstract01;

public abstract class Sekil {

    String name;

    public Sekil(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();

    public String toString() {
        return "Sekil = " + getName() +
                ", Alan = " + alan() +
                ", Cevre = " + cevre();
    }

    public String getName() {
        return name;
    }

    public void ciz() {
        System.out.println(getName() + " ciziliyor...");
    }

}