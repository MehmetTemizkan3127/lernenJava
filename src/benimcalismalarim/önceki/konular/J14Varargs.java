package benimcalismalarim.önceki.konular;

public class J14Varargs {
    /*
    14- Varargs (Değişken Sayıda Parametre)
Tanım:
Varargs, bir metoda değişken sayıda parametre geçirebilmenizi sağlar. Bu, metodu daha esnek hale getiren ve çağrılarda parametre sayısının belirsiz olduğu durumlarda faydalıdır.

Kullanım:
Varargs, metod parametre listesinde son parametre olarak tanımlanmalıdır. Varargs, diziler gibi çalışır ve metot içerisinde bir dizi olarak ele alınır.

java
Kodu kopyala
public void printNumbers(int... numbers) {
    for (int num : numbers) {
        System.out.println(num);
    }
}
Örnek:
java
Kodu kopyala
public class VarargsExample {
    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);  // Varargs kullanarak
        printNumbers(10, 20);         // Farklı sayıda parametre
    }
}
Önemli Not:
Varargs parametreler, son parametre olmalıdır. Eğer metodda birden fazla parametre varsa, varargs her zaman en son olmalıdır.
Varargs yalnızca aynı türdeki verileri alabilir.
Bir metotta yalnızca bir tane varargs parametre olabilir.
Konu Özeti:
Varargs, metotlara esnek sayıda parametre göndermeye olanak tanır.
Parametreler, metodun son parametresi olarak geçmelidir.
     */
}
