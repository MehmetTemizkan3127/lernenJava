package benimcalismalarim.konular;

import java.util.*;

public class ArrayList_calismalari {
    public static void main(String[] args) {
/*1. add(E element)
        Görevi: Listeye yeni bir eleman ekler.
        Kullanımı: list.add("eleman");
        Soru 1:
        Başlangıç olarak "apple" elemanını listeye ekleyin ve listenin son halini yazdırın.
*/
        List<String> kelimeler = new ArrayList<>();
        kelimeler.add("apple");
        System.out.println("Kelimeler = " + kelimeler);


/*2. add(int index, E element)
        Görevi: Belirtilen indekse eleman ekler.
        Kullanımı: list.add(1, "eleman");
        Soru 2:
        Listeye "banana"yı 2. indekse ekleyin ve listeyi tekrar yazdırın.
        */
        kelimeler.add(1,"banana");
        System.out.println("Kelimeler = " + kelimeler);


/*3. addAll(Collection<? extends E> c)
        Görevi: Başka bir koleksiyondaki elemanları listeye ekler.
        Kullanımı: list.addAll(otherList);
        Soru 3:
        Başka bir koleksiyondan "grape" ve "orange" elemanlarını mevcut listeye ekleyin. Sonuçları yazdırın.
        */
        kelimeler.addAll(Arrays.asList("grape", "orange"));
        System.out.println("Kelimeler = " + kelimeler);


/*4. clear()
        Görevi: Listeyi temizler, tüm elemanları siler.
        Kullanımı: list.clear();
        Soru 4:
        Listeyi temizleyin (clear()) ve listenin boş olup olmadığını kontrol edin. Listeyi tekrar yazdırın.
        */

        kelimeler.clear();
        System.out.println("Kelimeler = " + kelimeler);


/*5. contains(Object o)
        Görevi: Belirtilen elemanın listede olup olmadığını kontrol eder.
                Kullanımı: list.contains("eleman");
        Soru 5:
        Listeye "banana"yı ekleyin ve sonra "banana" elemanının listede olup olmadığını kontrol edin. Sonucu yazdırın.
        */

        kelimeler.add("banana");
        boolean varMi = kelimeler.contains("banana");
        System.out.println("varMi = " + varMi);
        System.out.println("Kelimeler = " + kelimeler);


/*6. containsAll(Collection<?> c)
        Görevi: Bir koleksiyondaki tüm elemanların listede olup olmadığını kontrol eder.
                Kullanımı: list.containsAll(otherList);
        Soru 6:
        Başka bir koleksiyondan "apple", "banana" ve "grape" elemanlarını içeren bir liste oluşturun.
        Bu listeyi ana listeyle karşılaştırarak tüm elemanların listede olup olmadığını kontrol edin.
        */

        kelimeler.addAll(Arrays.asList("apple", "banana", "grape"));
        boolean varMi1 = kelimeler.containsAll(Arrays.asList("banana", "apple", "banana", "grape"));
        System.out.println("var mi? = " + varMi1);
        System.out.println("Kelimeler = " + kelimeler);


/*7. get(int index)
        Görevi: Belirtilen indeksteki elemanı döndürür.
        Kullanımı: list.get(1);
        Soru 7:
        Listeyi tekrar oluşturun. 1. indeksteki elemanı yazdırın.
        */

        String birinciIndex = kelimeler.get(0);
        System.out.println("birinciIndex = " + birinciIndex);


/*8. indexOf(Object o)
        Görevi: Elemanın ilk bulunduğu indeksi döndürür.
                Kullanımı: list.indexOf("eleman");
        Soru 8:
        Listeye "orange"yı ekleyin ve "orange" elemanının ilk bulunduğu indeks değerini yazdırın.
        */

        kelimeler.add("orange");
        kelimeler.add(2,"orange");
        System.out.println("Güncel kelimeler = " + kelimeler);
        System.out.println("Orange'nin gectigi ilk index = "+kelimeler.indexOf("orange"));
        System.out.println("Orange'nin gectigi son index = "+kelimeler.lastIndexOf("orange"));

/*9. lastIndexOf(Object o)
        Görevi: Elemanın son bulunduğu indeksi döndürür.
                Kullanımı: list.lastIndexOf("eleman");
        Soru 9:
        Listeye "banana"yı bir kez daha ekleyin ve "banana"nın son indeksini yazdırın.
        */
        kelimeler.add(4,"banana");
        System.out.println("Güncel kelimeler = "+kelimeler);
        System.out.println("Banana'nin gectigi son index = " + kelimeler.lastIndexOf("banana"));

/*10. isEmpty()
        Görevi: Liste boşsa true döndürür, aksi takdirde false döner.
                Kullanımı: list.isEmpty();
        Soru 10:
        Listeyi temizleyin. Listeyi kontrol ederek boş olup olmadığını yazdırın.
        */
        kelimeler.clear();
        System.out.println("kelimeler.isEmpty() = " + kelimeler.isEmpty());


/*11. remove(Object o)
        Görevi: Belirtilen elemanı listeden siler.
        Kullanımı: list.remove("eleman");
        Soru 11:
        Listeye "apple", "banana", "orange" ekleyin. "banana"yı listeden silin ve sonucu yazdırın.
        */
        kelimeler.addAll(Arrays.asList("apple", "banana", "orange"));
        kelimeler.remove("banana");
        System.out.println("Güncel kelimeler = " + kelimeler);

/*12. remove(int index)
        Görevi: Belirtilen indeksteki elemanı siler.
        Kullanımı: list.remove(1);
        Soru 12:
        Listeye "grape", "peach", "watermelon" elemanlarını ekleyin. 1. indeksteki elemanı silin ve sonucu yazdırın.
        */
        kelimeler.addAll(Arrays.asList("grape", "peach", "watermelon"));
        System.out.println(kelimeler);
        kelimeler.remove(1);
        System.out.println("Silinen kelime sonrasi liste = " + kelimeler);

/*13. removeIf(Predicate<? super E> filter)
        Görevi: Belirli bir koşula uyan elemanları listeden siler.
                Kullanımı: list.removeIf(x -> x.startsWith("A"));
        Soru 13:
        Listeyi "apple", "apricot", "banana" ile oluşturun. "A" harfiyle başlayan tüm elemanları silin ve sonucu yazdırın.
        */
        kelimeler.addAll(Arrays.asList("apple", "apricot", "banana"));

        kelimeler.removeIf(x -> x.startsWith("A") || x.startsWith("a"));
        System.out.println(kelimeler);

/*14. retainAll(Collection<?> c)
        Görevi: Verilen koleksiyondaki elemanlar dışındaki tüm elemanları siler.
                Kullanımı: list.retainAll(otherList);
        Soru 14:
        Listeyi "apple", "banana", "grape" ile oluşturun.
        Başka bir koleksiyondan "banana", "grape" elemanlarını içeren listeyle karşılaştırarak,
        bu koleksiyona ait elemanları listede tutun. Sonuçları yazdırın.
        */

        List<String> collection = Arrays.asList("banana", "grape");
        kelimeler.retainAll(collection);
        System.out.println(kelimeler);


/*15. set(int index, E element)
        Görevi: Belirtilen indeksteki elemanı değiştirir.
        Kullanımı: list.set(1, "yeniEleman");
        Soru 15:
        Listeye "apple", "banana", "cherry" elemanlarını ekleyin. 1. indeksteki elemanı "grape" ile değiştirin ve sonucu yazdırın.
        */
        kelimeler.addAll(Arrays.asList("apple", "banana", "cherry"));
        kelimeler.set(1, "grape");
        kelimeler.set(0, "kavun");
        System.out.println("Set sonrasi  = " + kelimeler);



/*16. size()
        Görevi: Listenin boyutunu döndürür.
                Kullanımı: list.size();
        Soru 16:
        Listeye "apple", "banana", "cherry" elemanlarını ekleyin. Listenin boyutunu yazdırın.
        */
        System.out.println("ArrayList'in boyutu = "+kelimeler.size());

/*17. subList(int fromIndex, int toIndex)
        Görevi: Belirtilen indeks aralığındaki elemanları içeren alt liste döndürür.
        Kullanımı: list.subList(1, 3);
        Soru 17:
        Listeyi "apple", "banana", "cherry", "date", "elderberry" ile oluşturun. 1. ile 3. indeks arasındaki elemanları alt liste olarak alın ve yazdırın.
        */
        kelimeler.clear();
        kelimeler.addAll(Arrays.asList("elma", "armut", "kavun", "karpuz", "kiraz"));
        System.out.println("1. ve 3. index'teki kelimeler = "+kelimeler.subList(1, 4));

/*18. toArray()
        Görevi: Listeyi bir diziye dönüştürür.
        Kullanımı: Object[] array = list.toArray();
        Soru 18:
       Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi diziye dönüştürün ve yazdırı
       */
        Object[] array = kelimeler.toArray();

        for (Object kelimeGrubu : array) {
            System.out.print(kelimeGrubu+" ");
        }

        System.out.println();

/*19. toArray(T[] a)
        Görevi: Listeyi belirli bir türde diziye dönüştürür.
        Kullanımı: String[] array = list.toArray(new String[0]);
        Soru 19:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi String[] türünde diziye dönüştürün ve yazdırın.
        */
        String[] array1 = kelimeler.toArray(new String[0]);
        for (String eleman : array1) {
            System.out.print(eleman+" ");
        }

/*20. ensureCapacity(int minCapacity)
        Görevi: Liste kapasitesini belirtilen değere çıkarır.
                Kullanımı: list.ensureCapacity(20);
        Soru 20:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Liste kapasitesini 20'ye çıkarın ve kapasiteyi kontrol edin.
        */
        System.out.println();

/*21. trimToSize()
        Görevi: Kapasiteyi mevcut eleman sayısına indirir.
                Kullanımı: list.trimToSize();
        Soru 21:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Kapasiteyi mevcut eleman sayısına indirin ve sonucu kontrol edin.
        */
        ((ArrayList<String>) kelimeler).trimToSize();

        // trimToSize() sonrası kontrol
        System.out.println("trimToSize() çağrıldı. Listenin elemanları: " + kelimeler);

/*22. Collections.shuffle(List<?> list)
        Görevi: Listedeki elemanların sırasını karıştırır.
        Kullanımı: Collections.shuffle(list);
        Soru 22:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi karıştırın ve sonucu yazdırın.
        */
        Collections.shuffle(kelimeler);
        System.out.println(kelimeler);


/*23. Collections.sort(List<T> list)
        Görevi: Listeyi doğal sırasına göre sıralar.
                Kullanımı: Collections.sort(list);
        Soru 23:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi sıralayın ve sonucu yazdırın.
        */
        Collections.sort(kelimeler);
        System.out.println("Alfabetik siralamaya uygun kelimeler = " + kelimeler);


/*24. Collections.reverse(List<?> list)
        Görevi: Listeyi tersine çevirir.
                Kullanımı: Collections.reverse(list);
        Soru 24:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi tersine çevirin ve sonucu yazdırın.
        */
        Collections.reverse(kelimeler);
        System.out.println("Alfabetik siralamaya tersten uygun kelimeler = " +kelimeler);

/*25. List.copyOf(Collection<? extends T> coll)
        Görevi: Bir koleksiyonun bir kopyasını döndürür.
                Kullanımı: List<String> copy = List.copyOf(list);
        Soru 25:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Bu listeyi kopyalayın ve kopyayı yazdırın.
        */
        System.out.println(Collections.nCopies(2, "kavun"));

/*26. List.of(E... elements)
        Görevi: Sabit bir liste oluşturur.
        Kullanımı: List<String> list = List.of("apple", "banana", "cherry");
        Soru 26:
        Listeyi "apple", "banana", "cherry" elemanlarıyla oluşturun. Sonucu yazdırın.
        */
        kelimeler.addAll(List.of("apple", "banana", "cherry"));
        System.out.println(kelimeler);


/*27. List.sort(Comparator<? super E> c)
        Görevi: Listeyi karşılaştırıcıya göre sıralar.
        Kullanımı: list.sort(Comparator.reverseOrder());
        Soru 27:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi ters sıraya göre sıralayın ve yazdırın.
        */
        Collections.reverse(kelimeler);
        System.out.println(kelimeler);


/*28. List.subList(int fromIndex, int toIndex)
        Görevi: Belirtilen aralıktaki alt listeyi döndürür.
                Kullanımı: list.subList(1, 3);
        Soru 28:
        Listeyi "apple", "banana", "cherry", "date", "elderberry" ile oluşturun.
        1. ile 3. indeks arasındaki alt listeyi yazdırın.
        */
        kelimeler.addAll(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
        System.out.println("Eklenen son kelimeler = " + kelimeler);
        System.out.println(kelimeler.subList(1, 5));

/*29. List.addAll(int index, Collection<? extends E> c)
        Görevi: Belirtilen indeksten başlayarak başka bir koleksiyonu ekler.
                Kullanımı: list.addAll(2, otherList);
        Soru 29:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Başka bir koleksiyondan "date" ve "elderberry" elemanlarını 2. indeksten itibaren ekleyin. Sonucu yazdırın.
        */
        System.out.println(kelimeler);
        kelimeler.add(6, "kiwi");
        System.out.println(kelimeler);


/*30. List.replaceAll(UnaryOperator<E> operator)
        Görevi: Listedeki tüm elemanları belirtilen operatöre göre değiştirir.
                Kullanımı: list.replaceAll(x -> x.toUpperCase());
        Soru 30:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listedeki tüm elemanları büyük harfe çevirin ve yazdırın.
        */

        kelimeler.replaceAll(String::toUpperCase);
        System.out.println(kelimeler);

/*31. List.removeIf(Predicate<? super E> filter)
        Görevi: Verilen koşula uyan elemanları listeden siler.
        Kullanımı: list.removeIf(x -> x.startsWith("a"));
        Soru 31:
        Listeyi "apple", "banana", "avocado", "cherry" ile oluşturun. "A" harfiyle başlayan elemanları silin ve sonucu yazdırın.
        */
        kelimeler.removeIf(x -> x.startsWith("K") || x.startsWith("k"));
        System.out.println(kelimeler);


/*32. List.sort(Comparator<? super E> c)
        Görevi: Listeyi belirtilen karşılaştırıcıya göre sıralar.
                Kullanımı: list.sort(Comparator.comparing(String::length));
        Soru 32:
        Listeyi "apple", "banana", "avocado", "cherry" ile oluşturun. Listeyi elemanlarının uzunluğuna göre sıralayın ve sonucu yazdırın.
        */
        kelimeler.sort(Comparator.comparing(String::length));
        System.out.println("kelimelerin uzunlugu = " + kelimeler);


/*33. List.forEach(Consumer<? super E> action)
        Görevi: Listedeki her eleman üzerinde belirtilen işlemi uygular.
                Kullanımı: list.forEach(System.out::println);
        Soru 33:
        Listeyi "apple", "banana", "avocado", "cherry" ile oluşturun.
        Listedeki her bir elemanı yazdırmak için forEach metodunu kullanın.
        */
        kelimeler.forEach(System.out::println);

/*34. List.toArray(T[] a)
        Görevi: Listeyi belirtilen türdeki diziye dönüştürür.
                Kullanımı: String[] arr = list.toArray(new String[0]);
        Soru 34:
        Listeyi "apple", "banana", "avocado", "cherry" ile oluşturun. Listeyi bir String[] dizisine dönüştürün ve sonucu yazdırın.
        */

/*35. List.contains(Object o)
        Görevi: Listede belirtilen elemanın var olup olmadığını kontrol eder.
        Kullanımı: list.contains("apple");
        Soru 35:
        Listeyi "apple", "banana", "cherry" ile oluşturun. "apple" elemanının listede olup olmadığını kontrol edin.
        */
        System.out.println(kelimeler.contains("BANANA"));

/*36. List.replaceAll(UnaryOperator<E> operator)
        Görevi: Listedeki tüm elemanları belirtilen işlemi uygulayarak değiştirir.
                Kullanımı: list.replaceAll(x -> x.toUpperCase());
        Soru 36:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi tüm elemanlarını büyük harfe çevirerek değiştirecek şekilde replaceAll metodunu kullanın ve sonucu yazdırın.
        */
/*37. List.parallelStream()
        Görevi: Listeyi paralel bir stream olarak işler.
        Kullanımı: list.parallelStream().forEach(System.out::println);
        Soru 37:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi paralel stream kullanarak elemanlarını yazdırın.
        */
/*38. List.get(int index)
        Görevi: Belirtilen indeksteki elemanı döndürür.
        Kullanımı: list.get(2);
        Soru 38:
        Listeyi "apple", "banana", "cherry" ile oluşturun. 2. indeksteki elemanı alın ve yazdırın.
        */
/*39. List.indexOf(Object o)
        Görevi: Elemanın listede ilk bulunduğu indeksi döndürür.
        Kullanımı: list.indexOf("banana");
        Soru 39:
        Listeyi "apple", "banana", "cherry" ile oluşturun. "banana" elemanının listede ilk bulunduğu indeksi yazdırın.
        */
/*40. List.remove(Object o)
        Görevi: Belirtilen elemanı listeden siler.
        Kullanımı: list.remove("apple");
        Soru 40:
        Listeyi "apple", "banana", "cherry" ile oluşturun. "banana" elemanını listeden silin ve sonucu yazdırın.
        */
/*41. List.add(int index, E element)
        Görevi: Belirtilen indekse bir eleman ekler.
                Kullanımı: list.add(2, "apple");
        Soru 41:
        Listeyi "banana", "cherry", "date" ile oluşturun. "apple" elemanını 2. indekse ekleyin ve sonucu yazdırın.
        */
/*42. List.remove(int index)
        Görevi: Belirtilen indeksteki elemanı listeden siler.
                Kullanımı: list.remove(2);
        Soru 42:
        Listeyi "apple", "banana", "cherry" ile oluşturun. 2. indeksteki elemanı silin ve sonucu yazdırın.
        */
/*43. List.containsAll(Collection<?> c)
        Görevi: Bir koleksiyonun tüm elemanlarının listede olup olmadığını kontrol eder.
                Kullanımı: list.containsAll(otherList);
        Soru 43:
        Listeyi "apple", "banana", "cherry" ile oluşturun. "banana", "cherry" elemanlarını içeren bir koleksiyonla, listenin bu elemanları içerip içermediğini kontrol edin.
        */
/*44. List.equals(Object o)
        Görevi: İki listeyi karşılaştırır ve eşit olup olmadıklarını döndürür.
        Kullanımı: list.equals(otherList);
        Soru 44:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Aynı elemanları içeren başka bir listeyle karşılaştırarak eşit olup olmadığını kontrol edin.
        */
/*45. List.clear()
        Görevi: Listedeki tüm elemanları siler.
        Kullanımı: list.clear();
        Soru 45:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi clear metodu ile temizleyin ve sonucu yazdırın.
        */
/*46. List.isEmpty()
        Görevi: Liste boş mu değil mi kontrol eder.
                Kullanımı: list.isEmpty();
        Soru 46:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listenin boş olup olmadığını kontrol edin ve sonucu yazdırın.
        */
/*47. List.addAll(Collection<? extends E> c)
        Görevi: Belirtilen koleksiyondaki tüm elemanları listeye ekler.
        Kullanımı: list.addAll(otherList);
        Soru 47:
        Listeyi "apple", "banana", "cherry" ile oluşturun. "date", "elderberry" elemanlarını içeren bir koleksiyonu listeye ekleyin ve sonucu yazdırın.
        */
/*48. List.removeAll(Collection<?> c)
        Görevi: Belirtilen koleksiyonla aynı olan tüm elemanları listeden siler.
        Kullanımı: list.removeAll(otherList);
        Soru 48:
        Listeyi "apple", "banana", "cherry" ile oluşturun. "banana", "cherry" elemanlarını içeren bir koleksiyonu listeden silin ve sonucu yazdırın.
        */
/*49. List.retainAll(Collection<?> c)
        Görevi: Belirtilen koleksiyonla aynı olan elemanları listede tutar, diğerlerini siler.
                Kullanımı: list.retainAll(otherList);
        Soru 49:
        Listeyi "apple", "banana", "cherry" ile oluşturun. "banana", "cherry" elemanlarını içeren bir koleksiyonla, bu elemanları listede tutarak kalanları silin ve sonucu yazdırın.
        */

/*50. List.stream()
        Görevi: Listeyi stream'e dönüştürür.
        Kullanımı: list.stream().forEach(System.out::println);
        Soru 50:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Listeyi stream kullanarak yazdırın.
         */

/*51. List.addIfAbsent(E e) (Java 9 ve sonrası)
        Görevi: Listeye yalnızca belirtilen eleman yoksa ekler.
        Kullanımı: list.addIfAbsent("apple");
        Soru 51:
        Listeyi "banana", "cherry" ile oluşturun. "apple" elemanını yalnızca listede yoksa ekleyin ve sonucu yazdırın.
        */
/*52. List.replaceAll(Predicate<? super E> filter) (Java 9 ve sonrası)
        Görevi: Listeyi, belirtilen filtreye göre elemanlarını değiştirir.
        Kullanımı: list.replaceAll(x -> x + "fruit");
        Soru 52:
        Listeyi "apple", "banana", "cherry" ile oluşturun. Her bir elemanın sonuna "fruit" ekleyin ve sonucu yazdırın.
        */







    }}
