package javacalismalarim.konutekrari;

public class J3ScannerclassTypecasting {
    public static void main(String[] args) {
        // 1. Primitive Türler Arasında Casting

        // A. Genişletme (Widening Casting)

        // Küçük türden büyük türe dönüşüm.
        // Veri kaybı olmaz.
        // Otomatik yapılır.

        /*int intValue = 100;
        double doubleValue = intValue; // int → double
        float floatValue = intValue;
        System.out.println("doubleValue: " + doubleValue); // 100.0
        System.out.println("floatValue = " + floatValue);
        */

        /*Boolean
        Byte
        Short
        Integer
        Long
        Float
        Double
        */
        System.out.println("Autoboxing (Otomatik Dönüşüm)");
        byte sayi = 20;

        Byte sayiB = sayi;
        Short sayiS = (short) sayi;
        Integer sayiI = (int) sayi;
        Long sayiL = (long) sayi;
        Float sayiF = (float) sayi;
        Double sayiD = (double)sayi;

        System.out.println(sayiB);
        System.out.println(sayiS);
        System.out.println(sayiI);
        System.out.println(sayiL);
        System.out.println(sayiF);
        System.out.println(sayiD);



        // B. Daraltma (Narrowing Casting)
        System.out.println("Boxing (Elle Dönüşüm)");
        /*
        Double
        Float
        Long
        Integer
        Short
         Byte
        Boolean
        */

        double num = 125.54; // Primitive tip

        Byte sayiB1 = Byte.valueOf((byte) num);
        Short sayiS1 = Short.valueOf((short) num);
        Integer sayiI1 = Integer.valueOf((int) num);
        Long sayiL1 = Long.valueOf((long) num);
        Float sayiF1 = Float.valueOf((float)num);
        Double sayiD1 = Double.valueOf((double)num);

        System.out.println(sayiB1);
        System.out.println(sayiS1);
        System.out.println(sayiI1);
        System.out.println(sayiL1);
        System.out.println(sayiF1);
        System.out.println(sayiD1);


        /*Boolean
        Byte
        Short
        Integer
        Long
        Float
        Double
        */
        System.out.println("Autoboxing (Otomatik Dönüşüm)");
        Byte sayi1 = 20;

        byte sayiB2 = sayi;
        short sayiS2 = (short) sayi;
        int sayiI2 = (int) sayi;
        long sayiL2 = (long) sayi;
        float sayiF2 = (float) sayi;
        double sayiD2 = (double)sayi;

        System.out.println(sayiB2);
        System.out.println(sayiS2);
        System.out.println(sayiI2);
        System.out.println(sayiL2);
        System.out.println(sayiF2);
        System.out.println(sayiD2);



        // B. Daraltma (Narrowing Casting)
        System.out.println("Boxing (Elle Dönüşüm)");
        /*
        Double
        Float
        Long
        Integer
        Short
         Byte
        Boolean
        */

        Double num1 = 125.54; // Autoboxing
        int num2 = 20; // Primitive tip
        Integer aSayi = num2;
        System.out.println("aSayi = " + aSayi);

        byte sayiB3 = (byte) num1.doubleValue();
        short sayiS3 = (short) num1.shortValue();
        int sayiI3 = (int) num1.shortValue();
        long sayiL3 = (long) num1.longValue();
        float sayiF3 = (float) num1.floatValue();
        double sayiD3 = (double) num1.doubleValue();

        System.out.println(sayiB3);
        System.out.println(sayiS3);
        System.out.println(sayiI3);
        System.out.println(sayiL3);
        System.out.println(sayiF3);
        System.out.println(sayiD3);




        /*
03- Scanner Class ve Type Casting
Scanner Class:
Kullanıcıdan veri almak için kullanılır. Java'nın java.util paketindedir.

java
Kodu kopyala
Scanner scanner = new Scanner(System.in);
System.out.print("Yaşınızı giriniz: ");
int age = scanner.nextInt();
Type Casting:
Bir veri tipini başka bir tipe dönüştürme işlemidir.

Widening Casting (Otomatik): Küçük bir tür, büyük bir türe dönüştürülür.
java
Kodu kopyala
int num = 100;
double doubleNum = num;
Narrowing Casting (Manuel): Büyük bir tür, küçük bir türe dönüştürülür.
java
Kodu kopyala
double num = 100.5;
int intNum = (int) num;
Tür	Örnek	Dikkat Edilmesi Gerekenler
Widening	int -> double	Veri kaybı yok.
Narrowing	double -> int	Veri kaybı olabilir.
Önemli Not:
Kullanıcıdan alınan veriler daima String tipindedir. Tip dönüşümü gerekebilir.
Konu Özeti:
Scanner, kullanıcı etkileşimi için önemlidir.
Tip dönüşümlerinde veri kaybına dikkat edilmelidir.



1. Primitive Türler Arasında Casting
a. Genişletme (Widening Casting)
Küçük türden büyük türe dönüşüm.
Veri kaybı olmaz.
Otomatik yapılır.
Örnek:
java
Kodu kopyala
int intValue = 100;
double doubleValue = intValue; // int → double
System.out.println("doubleValue: " + doubleValue); // 100.0
b. Daraltma (Narrowing Casting)
Büyük türden küçük türe dönüşüm.
Veri kaybı olabilir.
Manuel olarak (tür) yazılarak yapılır.
Örnek:
java
Kodu kopyala
double doubleValue = 123.45;
int intValue = (int) doubleValue; // double → int (küsurat atılır)
System.out.println("intValue: " + intValue); // 123
Başka Daraltma Örnekleri:
java
Kodu kopyala
long longValue = 1000L;
short shortValue = (short) longValue; // long → short
System.out.println("shortValue: " + shortValue); // 1000
c. byte, short, char ve int Dönüşümleri
java
Kodu kopyala
char charValue = 'A'; // ASCII değeri 65
int intValue = charValue; // char → int (ASCII kodu alınır)
System.out.println("intValue: " + intValue); // 65

int num = 97;
char charValue2 = (char) num; // int → char
System.out.println("charValue2: " + charValue2); // 'a'
d. float ve long Dönüşümleri
java
Kodu kopyala
float floatValue = 10.99F;
long longValue = (long) floatValue; // float → long (küsurat atılır)
System.out.println("longValue: " + longValue); // 10
2. Wrapper Class'lar ile Casting
Wrapper class'lar (Integer, Double, Boolean, vb.) primitive türlerin nesne halidir.
Primitive türler ile wrapper class'lar arasında dönüşüm şu şekildedir:

a. Autoboxing (Primitive → Wrapper):
java
Kodu kopyala
int num = 50;
Integer intObj = num; // Otomatik dönüştürme
System.out.println("Integer object: " + intObj); // 50
b. Unboxing (Wrapper → Primitive):
java
Kodu kopyala
Integer intObj = 50;
int num = intObj; // Otomatik dönüştürme
System.out.println("Primitive int: " + num); // 50
c. Casting ile Wrapper Class Kullanımı:
java
Kodu kopyala
double d = 123.45;
Integer intObj = (int) d; // double → int (manuel cast gerekiyor)
System.out.println("Integer object: " + intObj); // 123
3. Referans Türleri (Objects) Arasında Casting
a. Upcasting (Genişletme)
Alt sınıf nesnesini üst sınıf türüne dönüştürme.
Otomatik yapılır.
Örnek:
java
Kodu kopyala
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}

Animal myDog = new Dog(); // Dog nesnesi → Animal türü (upcasting)
myDog.sound(); // Çıktı: Bark
b. Downcasting (Daraltma)
Üst sınıf türündeki bir nesneyi alt sınıf türüne dönüştürme.
Manuel (AltSınıf) yazılarak yapılır.
Örnek:
java
Kodu kopyala
Animal myAnimal = new Dog(); // Upcasting
Dog myDog = (Dog) myAnimal; // Downcasting
myDog.sound(); // Çıktı: Bark
Hatalı Downcasting Örneği:

java
Kodu kopyala
Animal myAnimal = new Animal();
Dog myDog = (Dog) myAnimal; // ClassCastException fırlatılır
4. String ve Sayısal Türler Arasında Casting
a. String → Sayısal Türler (Parsing)
Integer.parseInt, Double.parseDouble, vb. metodlar kullanılır.

Örnek:
java
Kodu kopyala
String str = "123";
int num = Integer.parseInt(str); // String → int
System.out.println("Parsed int: " + num); // 123
b. Sayısal Türler → String
java
Kodu kopyala
int num = 123;
String str = String.valueOf(num); // int → String
System.out.println("String: " + str); // "123"
5. Casting ile İlgili Özel Durumlar
a. Overflow/Underflow
Daraltma sırasında taşma (overflow) olabilir:

java
Kodu kopyala
int bigNum = 130;
byte smallNum = (byte) bigNum; // 130, byte sınırını aşar (-128 ile 127)
System.out.println("smallNum: " + smallNum); // -126
b. Küsuratın Kaybı
java
Kodu kopyala
double d = 9.99;
int i = (int) d; // Küsurat atılır
System.out.println("int: " + i); // 9
Özet
Primitive türler arasında widening otomatik yapılırken, narrowing için manuel (tür) dönüşüm gerekir.
Referans türleri için upcasting otomatik yapılır, ancak downcasting manuel ve dikkatli yapılmalıdır.
Wrapper class'lar primitive türlere kolayca dönüştürülür (autoboxing/unboxing).
String ve sayısal türler arasında dönüşüm özel metodlarla yapılır (örn: parseInt, valueOf).



Java'da Primitif ve Non-Primitif Veri Türleri
Java'da veri türleri, primitif (değer tipi) ve non-primitif (referans tipi) olmak üzere iki ana kategoriye ayrılır.
Primitif veri türleri doğrudan bellekte değeri saklarken, non-primitif türler nesneleri temsil eder ve
veriye referans tutar.

1. Primitif (Değer) Veri Türleri
Primitif veri türleri Java'nın temel yapı taşlarıdır ve doğrudan değerleri bellekte saklar.
Aşağıda bu türler ve detayları verilmiştir:

boolean

Boyut: 1 bit (true/false değeri için).
Örnek Değer: true, false.
byte

Boyut: 1 bayt (8 bit).
Örnek Değer: 127, -128.
short

Boyut: 2 bayt (16 bit).
Örnek Değer: 32767, -32768.
int

Boyut: 4 bayt (32 bit).
Örnek Değer: 2147483647, -2147483648.
long

Boyut: 8 bayt (64 bit).
Örnek Değer: 9223372036854775807L, -9223372036854775808L.
float

Boyut: 4 bayt (32 bit).
Örnek Değer: 3.14f, -2.5f.
double

Boyut: 8 bayt (64 bit).
Örnek Değer: 3.14159, -0.123456.
char

Boyut: 2 bayt (16 bit).
Örnek Değer: 'a', 'Z'.
2. Non-Primitif (Referans) Veri Türleri
Non-primitif türler, Java'da sınıflar ve nesnelerle çalışmak için kullanılan referans türleridir.
Bu türler, bellekte bir referans saklar ve daha fazla özellik sunar.

String

Boyut: Karakter sayısına bağlıdır.
Örnek Değer: "Merhaba Dünya", "Java".
Integer

Boyut: 4 bayt (32 bit).
Örnek Değer: Integer.valueOf(42).
Açıklama: int türünün nesne karşılığıdır.
Double

Boyut: 8 bayt (64 bit).
Örnek Değer: Double.valueOf(3.14159).
Float

Boyut: 4 bayt (32 bit).
Örnek Değer: Float.valueOf(3.14f).
Character

Boyut: 2 bayt (16 bit).
Örnek Değer: Character.valueOf('A').
Boolean

Boyut: 1 bayt (gerçek bellekte daha fazla kullanılabilir).
Örnek Değer: Boolean.valueOf(true).
Long

Boyut: 8 bayt (64 bit).
Örnek Değer: Long.valueOf(123456789L).
Wrapper Class'lar ve Non-Primitif Olmaları
Wrapper class'lar, Java'da primitif veri türlerini bir nesne olarak temsil eden non-primitif (referans tipi)
sınıflardır.
Örneğin:

int → Integer
boolean → Boolean
char → Character
double → Double
Bu sınıflar, bellek yönetimi açısından non-primitif türlerdir çünkü bunlar nesneler olarak çalışır ve veri üzerinde
ekstra işlevler sunar. Örneğin:

java
Kodu kopyala
Integer myInt = Integer.valueOf(42); // Primitifi nesneye dönüştürme
String str = myInt.toString();      // Integer'ı String'e dönüştürme
Özet
Java'da veri türleri şu şekilde sınıflandırılabilir:

Primitif Veri Türleri:
boolean, byte, short, int, long, float, double, char.

Non-Primitif Veri Türleri:
String, Integer, Double, Float, Character, Boolean, Long.

Primitif türler hafif ve verimli oldukları için performans açısından avantajlıdır. Ancak non-primitif türler,
daha fazla özellik ve işlevsellik sundukları için sınıf tabanlı programlamada sıkça kullanılır. Wrapper class'lar,
primitif türleri nesne tabanlı bir şekilde kullanmamıza olanak tanır ve veri üzerinde daha fazla işlem yapabilmemize
yardımcı olur.

         */





    }
}
