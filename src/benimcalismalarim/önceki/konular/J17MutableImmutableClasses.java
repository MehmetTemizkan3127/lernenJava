package benimcalismalarim.önceki.konular;

public class J17MutableImmutableClasses {
    /*
    17- Mutable and Immutable Classes (Değiştirilebilir ve Değiştirilemez Sınıflar)
Tanım:
Mutable (Değiştirilebilir) sınıflar, nesneleri oluşturduktan sonra değiştirilebilir.
Immutable (Değiştirilemez) sınıflar ise nesneleri oluşturduktan sonra değiştirilemez.
Immutable Sınıf Örneği:
java
Kodu kopyala
public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
final anahtar kelimesi, sınıfın ve sınıf içindeki alanların değiştirilemeyeceğini garanti eder.
Immutable sınıflar genellikle multi-threading (çoklu iş parçacığı) ortamlarında tercih edilir, çünkü değiştirilemezler.
Mutable Sınıf Örneği:
java
Kodu kopyala
public class MutablePerson {
    private String name;
    private int age;

    public MutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
Burada, nesne oluşturulduktan sonra setName ve setAge metotları ile nesne üzerinde değişiklik yapılabilir.
Önemli Not:
Immutable sınıflar, genellikle thread-safe (çoklu iş parçacığında güvenli) oldukları için tercih edilir.
Mutable sınıflar daha esnektir ancak dikkatli kullanılması gerekir, çünkü çoklu iş parçacığı erişimi için senkronizasyon gerektirebilir.
Konu Özeti:
Immutable sınıflar değiştirilemez, mutable sınıflar ise değiştirilebilir.
Her iki tür de farklı durumlar için avantajlar sunar.
     */
}
