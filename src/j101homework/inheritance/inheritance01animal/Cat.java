package j101homework.inheritance.inheritance01animal;

public class Cat extends Animal{

    void meow(){
        System.out.println(name+" miyavliyor");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+ " balik yiyor");
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println(name+ " cekyatin üzerinde");
    }
}
