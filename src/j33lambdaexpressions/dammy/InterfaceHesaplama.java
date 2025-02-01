package j33lambdaexpressions.dammy;

@FunctionalInterface
interface Hesaplama {
    // Soyut metod: iki sayıyı alıp işlem yapacak
   // int islemYap(int sayi1, int sayi2);




    int islemYap(int... sayilar); // Varargs kullanımı

}



@FunctionalInterface
interface MetinIslemi {
    String islemYap(String... metinler); // Varargs ile String alıyor
}

//Fonksiyonel Arayüz	Kullanım	Örnek
//@FunctionalInterface	Hesaplama arayüzü	                            İki sayıyı çarpma
//Function<T, R>	    Sayının karesi	                                apply ile karesini hesaplama
//BiFunction<T, U, R>	İki sayıyı toplama	                            apply ile toplam
//Consumer<T>	        Sayıyı ekrana yazdırma                          accept ile yazdırma
//Supplier<T>	        Rastgele sayı döndürme                          get ile rastgele sayı
//Predicate<T>	        Sayının pozitif olup olmadığını kontrol etme	test ile kontrol
