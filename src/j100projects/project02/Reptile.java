package j100projects.project02;

public class Reptile extends Animal{
    private boolean isVenomous;

    public Reptile(String name, String species, int age, boolean isVenomous) {
        super(name, species, age);
        this.isVenomous = isVenomous;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }
}
