package j24inheritance.tasks;

public class test {

    // Parent sınıfı
    static class Parent {
        public Parent() {
            System.out.println("Parent Cons çalıştı");
        }

        int age = 56;
        void display() {
            System.out.println("Parent display");
        }
    }

    // Child sınıfı
    static class Child extends Parent {
        public Child() {
            System.out.println("Child Cons çalıştı");
        }

        int age = 26;
        @Override
        void display() {
            age = 30;
            System.out.println("Child display");
        }
    }

    public static void main(String[] args) {
        // task01
        Parent obj = new Child();
        obj.display(); // Child display
        System.out.println("obj.age = " + obj.age); // 56

        System.out.println();
        System.out.println("task02");
        Parent obj1 = new Parent();
        System.out.println("obj1.age = " + obj1.age); // 56
        obj1.display(); // Parent display

        System.out.println();
        System.out.println("task03");
        Child obj2 = new Child();
        System.out.println("obj2.age = " + obj2.age); // 26
        obj2.display(); // Child display
        System.out.println("obj2.age = " + obj2.age); // 30
    }
}
