package j101homework.homework.inheritance3;

public class Runner {
    /*Görev:
    Person adında bir sınıf oluşturun. Bu sınıfın:
    name ve id adında iki özelliği olsun.
    Bu özellikleri başlatan bir constructor ekleyin.
    getDetails() adında bir metot ekleyin ve ad ile ID'yi döndürsün.
    Student adında bir sınıf oluşturun ve Person sınıfından miras alın.
    grade adında bir özellik ekleyin.
    Constructor'ı super ile çağırarak ek özellikleri başlatın.
    getDetails() metodunu override ederek hem ad, ID hem de not bilgisini döndürsün.
    Main metodunda bir öğrenci nesnesi oluşturup override edilen metodu çağırın.
    */
    public static void main(String[] args) {


        Student student1 = new Student("Mehmet  ", 60.5);
        Student student2 = new Student("Ali     ", 80.0);
        Student student3 = new Student("Rukiye  ", 95.0);

        System.out.println(student1.getDetails());
        System.out.println(student2.getDetails());
        System.out.println(student3.getDetails());



    }

}