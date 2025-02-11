package j101homework.inheritance.inheritance03person;

public class Student extends Person {
    //Student adında bir sınıf oluşturun ve Person sınıfından miras alın.
    //grade adında bir özellik ekleyin.
    //Constructor'ı super ile çağırarak ek özellikleri başlatın.
    //getDetails() metodunu override ederek hem ad, ID hem de not bilgisini döndürsün.

    double grade;

    public Student(String name, double grade) {
        super(name);
        this.grade = grade;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Grade: " + grade;
    }
}


