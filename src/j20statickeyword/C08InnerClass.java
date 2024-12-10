package j20statickeyword;

public class C08InnerClass {

    public static void main(String[] args) {

        Person.Teacher teacher = new Person.Teacher();
        System.out.println("teacher.lastname = " + teacher.lastname);
        System.out.println("Person.Teacher.tel = " + Person.Teacher.tel);

    }

}
