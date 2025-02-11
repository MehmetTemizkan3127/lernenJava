package j101homework.inheritance.inheritance02car;

public class ElectricCar extends Car {
int batteryCapacity;

    @Override
    void start() {
        System.out.println("Elektrikli araba calistirildi");
    }

    void chargeBattery(){
        System.out.println("Elektrikli arabanin bataryasi sarj ediliyor. Batarya kapasitesi = "+batteryCapacity);

    }
}
