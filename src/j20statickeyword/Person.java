package j20statickeyword;

public class Person {

    int age = 5;
    static int number = 10;


    static class Teacher {

        //Dış sınıfın bir nesnesine gerek duymadan çalışabilir.
        //Yalnızca dış sınıfın statik üyelerine erişebilir.
       static int tel = 1234;
       String lastname = "Doe";

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
