package j101homework.homework.inheritance2;

public class Car extends Vehicle{
    int numberOfDoors;

    @Override
    void start() {
        System.out.println("Araba calistirildi");
    }
}
