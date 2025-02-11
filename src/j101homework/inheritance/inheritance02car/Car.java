package j101homework.inheritance.inheritance02car;

public class Car extends Vehicle{
    int numberOfDoors;

    @Override
    void start() {
        System.out.println("Araba calistirildi");
    }
}
