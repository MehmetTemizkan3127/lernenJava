package ocasinavsorulari.Q091;

public class Cat extends Animal implements Hunter {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void hunt() {
        System.out.println("Cat hunts a mouse");
    }
}
