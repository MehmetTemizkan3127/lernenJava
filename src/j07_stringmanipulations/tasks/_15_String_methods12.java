package j07_stringmanipulations.tasks;

public class _15_String_methods12 {

    public static void main(String[] args) {

        /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        //Kodu aşağıya yazınız.

        String city = "Florida";
        int index = city.indexOf('o');
        System.out.println(index);
        System.out.println(city.charAt(2));
        System.out.println("Kelimenin 2. indeksi: " + 2);
    }
}
