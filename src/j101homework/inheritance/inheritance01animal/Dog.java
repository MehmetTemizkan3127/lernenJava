package j101homework.inheritance.inheritance01animal;

public class Dog extends Animal {

    void bark(){
        System.out.println(name+" havliyor");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+" et yiyor");
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println(name+ " kafesinde uyuyor");
    }
}
