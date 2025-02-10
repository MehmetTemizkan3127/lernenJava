package j101homework.inheritance03person;

public class Person {
    //Person adında bir sınıf oluşturun.
    //Bu sınıfın:name ve id adında iki özelliği olsun.
    //Bu özellikleri başlatan bir constructor ekleyin.
    //getDetails() adında bir metot ekleyin ve ad ile ID'yi döndürsün.

    String name;
    String id;
    static int counter = 100;


    public Person(String name) {
        this.name = name;


        this.id = name.charAt(0) + String.valueOf(counter);
        counter++;
    }


    public String getDetails() {
        return "Name: " + name + ", ID: " + id;
    }
}