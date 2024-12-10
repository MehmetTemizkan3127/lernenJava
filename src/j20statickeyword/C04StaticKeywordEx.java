package j20statickeyword;

public class C04StaticKeywordEx {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.age = 8;//Obje için geçerli instance variable üzerindeki değişikşik sadece o obje için geçerlidir.
        person1.number = 20;//Bir static variable hergangi bir obje tarafında değiştirildiğinde bu değişiklik tüm objeler için geçerlidir.
        System.out.println("person1.age = " + person1.age);
        System.out.println("person1.number = " + person1.number);//20

        Person person2 = new Person();
        System.out.println("person2.age = " + person2.age);
        System.out.println("person2.number = " + person2.number);//20

        System.out.println("Person.number = " + Person.number);//20
        Person.number = 15;
        System.out.println("Person.number = " + Person.number);//15
        System.out.println("person1.number = " + person1.number);//15
        System.out.println("person2.number = " + person2.number);//15


    }


}
