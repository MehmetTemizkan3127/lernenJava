package j101homework.inheritance.inheritance01animal;

public class Runner {/*Task:
    Bir Animal (Hayvan) sınıfı oluşturun. Bu sınıfın:
    name ve age adında iki özelliği olsun.
            eat() ve sleep() adında iki metodu olsun. Metotlar ekrana basit bir mesaj yazsın (örn: "Hayvan yemek yiyor").
    Dog ve Cat adında iki sınıf oluşturun ve Animal sınıfından miras alın.
    Dog sınıfına:
    bark() adında bir metot ekleyin.
    Cat sınıfına:
    meow() adında bir metot ekleyin.
    Main metodunda Dog ve Cat nesneleri oluşturup tüm metodlarını çağırın.*/

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Duman";
        dog.age = 3;
        System.out.println(dog.name+" adli köpegin yasi = "  + dog.age);
        dog.bark();
        dog.eat();
        dog.sleep();

        System.out.println();

        Cat cat = new Cat();
        cat.name = "Pati";
        cat.age = 2;
        System.out.println(cat.name+ " adli kedinin yasi = "+cat.age);
        cat.meow();
        cat.eat();
        cat.sleep();


    }
}
