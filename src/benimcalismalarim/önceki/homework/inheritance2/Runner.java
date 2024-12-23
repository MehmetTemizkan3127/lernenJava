package benimcalismalarim.önceki.homework.inheritance2;

public class Runner {/*Görev:
    Vehicle adında bir sınıf oluşturun. Bu sınıf:
    brand adında bir özellik ve start() adında bir metot içersin.
    Car sınıfını Vehicle sınıfından türetin.
    numberOfDoors adında bir özellik ekleyin.
            start() metodunu override ederek "Araba çalıştırıldı" yazsın.
    ElectricCar sınıfını Car sınıfından türetin.
    batteryCapacity adında bir özellik ekleyin.
            chargeBattery() adında bir metot yazın.
    Main metodunda bir ElectricCar nesnesi oluşturun ve tüm metodları kullanarak ekrana sonuçları yazdırın.
    */

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.brand = "Porsche";
        electricCar.numberOfDoors = 2;
        electricCar.batteryCapacity = 100;
        System.out.println("Markasi = "+electricCar.brand);
        System.out.println("Kapi Sayisi = "+electricCar.numberOfDoors);
        electricCar.start();
        electricCar.chargeBattery();


    }
}
