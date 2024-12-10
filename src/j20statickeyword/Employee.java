package j20statickeyword;

public class Employee {

    static int counter;
    String name;
    int age;
    String id;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        id = String.valueOf(name.charAt(0)) + age + counter;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
