package javacalismalarim.konutekrari.string_metodlari;

public class Length {
    public static void main(String[] args) {

                /*length() Metodu Detaylı Anlatım
                Java'da length() metodu, bir string'in toplam karakter sayısını döndürmek için kullanılır.
                Bu karakterlere boşluklar, özel karakterler, ve hatta kaçış dizileri (\n, \t vb.) de dahildir.

                length() metodu, Java'nın String sınıfının bir özelliği olup, bir dizinin boyutunu ölçen array.
                length özelliğinden farklıdır. Çünkü bir string aslında karakterlerden oluşmuş bir nesnedir,
                dizi değildir.
                */

                //Temel Kullanım:

                String str = "Merhaba Dünya";
                int uzunluk = str.length();
                System.out.println("String uzunluğu: " + uzunluk); // Çıktı: 13
                // Temel Kullanım
                String str1 = "Merhaba Dünya";
                System.out.println("Uzunluk: " + str1.length()); // Çıktı: 13

                // Boş String
                String str2 = "";
                System.out.println("Boş String Uzunluğu: " + str2.length()); // Çıktı: 0

                // Sadece Boşluklar
                String str3 = "   ";
                System.out.println("Sadece Boşluklar Uzunluğu: " + str3.length()); // Çıktı: 3

                // Escape Karakterler
                String str4 = "Java\nProgramlama";
                System.out.println("Escape Karakterlerle Uzunluk: " + str4.length()); // Çıktı: 17

                // Unicode ve Emoji
                String str5 = "😊 Merhaba!";
                System.out.println("Unicode Karakterlerle Uzunluk: " + str5.length()); // Çıktı: 10

                // Null Kontrolü
                String str6 = null;
                if (str6 != null) {
                    System.out.println("Null Olmayan String Uzunluğu: " + str6.length());
                } else {
                    System.out.println("String null, uzunluk alınamaz!");
                }

                // Uzunluğa Göre Kontrol ve Alt String Alma
                String str7 = "Merhaba Dünya";
                if (str7.length() > 10) {
                    System.out.println("İlk 10 Karakter: " + str7.substring(0, 10)); // Çıktı: Merhaba Dü
                }
            }
        }

