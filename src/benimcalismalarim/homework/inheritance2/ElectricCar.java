package benimcalismalarim.homework.inheritance2;

public class ElectricCar extends Car {
int batteryCapacity;

    void chargeBattery(){
        System.out.println("Elektrikli arabanin bataryasi sarj ediliyor. Kapasitesi = "+batteryCapacity);
    }
}
