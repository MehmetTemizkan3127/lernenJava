package javacalismalarim.konutekrari.map;

public class Map {
    /*


  String Metodları
------------------
- length()                                  - Uzunluk
- charAt(int index)                         - Karakter Al
- substring(int beginIndex, int endIndex)   - Alt Dize
- toLowerCase()                             - Küçük Harfe Çevir
- toUpperCase()                             - Büyük Harfe Çevir
- equals(Object anObject)                   - Eşitlik Kontrolü
- equalsIgnoreCase(String anotherString)    - Büyük/Küçük Harf Duyarsız Eşitlik
- contains(CharSequence sequence)           - İçerik Kontrolü
- indexOf(int ch)                           - İlk Bulunduğu İndeks
- lastIndexOf(int ch)                       - Son Bulunduğu İndeks
- trim()                                    - Boşlukları Temizle
- replace(char oldChar, char newChar)       - Karakter Değiştirme
- split(String regex)                       - Bölme


  Arrays Metodları
------------------
- sort(T[] array)                               - Sıralama
- binarySearch(T[] array, T key)                - İkili Arama
- equals(T[] array1, T[] array2)                - Eşitlik Kontrolü
- fill(T[] array, T value)                      - Diziye Değer Atama
- copyOf(T[] original, int newLength)           - Dizi Kopyalama
- copyOfRange(T[] original, int from, int to)   - Dizi Aralığını Kopyalama
- asList(T... a)                                - Listeye Çevirme
- toString(T[] array)                           - Diziyi String'e Çevirme


  List Metodları
--------------
- add(E e)                                - Eleman Ekleme
- add(int index, E element)               - İndekse Eleman Ekleme
- remove(Object o)                        - Eleman Silme
- remove(int index)                       - İndeksteki Elemanı Silme
- get(int index)                          - Eleman Getirme
- set(int index, E element)               - Eleman Güncelleme
- size()                                  - Boyut
- isEmpty()                               - Boşluk Kontrolü
- contains(Object o)                      - İçerik Kontrolü
- clear()                                 - Temizleme
- indexOf(Object o)                       - İlk İndeks
- lastIndexOf(Object o)                   - Son İndeks
- subList(int fromIndex, int toIndex)     - Alt Liste
- toArray()                               - Dizine Çevirme
- addAll(Collection<? extends E> c)       - Koleksiyon Ekleme
- removeAll(Collection<?> c)              - Koleksiyon Silme
- retainAll(Collection<?> c)              - Ortak Elemanları Tutma
- equals(Object o)                        - Eşitlik
- hashCode()                              - Hash Kodu
- listIterator()                          - Liste Yineleyici
- listIterator(int index)                 - İndeksten Başlayan Yineleyici
- iterator()                              - Yineleyici



  ArrayList ve List Metodları
-----------------------------
- add(E e) - Ekleme
- remove(Object o)                      - Silme
- get(int index)                        - Eleman Al
- set(int index, E element)             - Eleman Değiştirme
- size()                                - Boyut
- isEmpty()                             - Boşluk Kontrolü
- contains(Object o)                    - İçerik Kontrolü
- clear()                               - Temizleme
- indexOf(Object o)                     - İndeks Bulma
- toArray()                             - Diziye Dönüştürme
- addAll(Collection<? extends E> c)     - Koleksiyon Ekleme
- removeAll(Collection<?> c)            - Koleksiyondan Eleman Silme
- retainAll(Collection<?> c)            - Ortak Elemanları Tutma


  Collections Metodları
-----------------------
- sort(List<T> list)                                                - Listeyi Sıralama
- reverse(List<?> list)                                             - Listeyi Ters Çevirme
- shuffle(List<?> list)                                             - Listeyi Karıştırma
- swap(List<?> list, int i, int j)                                  - Eleman Değiştirme
- max(Collection<? extends T> coll)                                 - Maksimum Eleman
- min(Collection<? extends T> coll)                                 - Minimum Eleman
- frequency(Collection<?> c, Object o)                              - Eleman Frekansı
- fill(List<? super T> list, T obj)                                 - Listeyi Değerle Doldurma
- disjoint(Collection<?> c1, Collection<?> c2)                      - Ortak Eleman Kontrolü
- binarySearch(List<? extends Comparable<? super T>> list, T key)   - İkili Arama



  Set Metodları
    - HashSet
    - LinkedHashSet
    - TreeSet
---------------
- add(E e)                              - Ekleme
- remove(Object o)                      - Silme
- contains(Object o)                    - İçerik Kontrolü
- size()                                - Boyut
- isEmpty()                             - Boşluk Kontrolü
- clear()                               - Temizleme
- iterator()                            - Yineleyici
- forEach(Consumer<? super E> action)   - İşlem Uygulama
- addAll(Collection<? extends E> c)     - Koleksiyon Ekleme
- retainAll(Collection<?> c)            - Ortak Elemanları Tutma
- removeAll(Collection<?> c)            - Koleksiyondan Eleman Silme
- equals(Object o)                      - Eşitlik Kontrolü
- hashCode()                            - Hash Kodu


  Queue Metodları
---------------
- add(E e)              - Ekleme
- offer(E e)            - Teklif Etme
- remove()              - Silme
- poll()                - Çıkarma
- element()             - İlk Elemanı Getirme
- peek()                - İlk Elemanı Görüntüleme
- isEmpty()             - Boşluk Kontrolü
- size()                - Boyut
- clear()               - Temizleme
- contains(Object o)    - İçerik Kontrolü
- toArray()             - Diziye Dönüştürme


  Deque Metodları
---------------
- addFirst(E e)     - Başına Ekleme
- addLast(E e)      - Sonuna Ekleme
- offerFirst(E e)   - Başına Teklif Etme
- offerLast(E e)    - Sonuna Teklif Etme
- removeFirst()     - Baştan Eleman Silme
- removeLast()      - Sondan Eleman Silme
- pollFirst()       - Baştan Eleman Çıkarma
- pollLast()        - Sondan Eleman Çıkarma
- getFirst()        - Baştaki Elemanı Getirme
- getLast()         - Sondaki Elemanı Getirme
- peekFirst()       - Baştaki Elemanı Görüntüleme
- peekLast()        - Sondaki Elemanı Görüntüleme
- isEmpty()         - Boşluk Kontrolü
- size()            - Boyut
- clear()           - Temizleme
- contains(Object o)- İçerik Kontrolü
- toArray()         - Diziye Dönüştürme


  Map Metodları
    - HashMap
    - LinkedHashMap
    - TreeMap
---------------
- put(K key, V value)           - Ekleme
- get(Object key)               - Getirme
- remove(Object key)            - Silme
- containsKey(Object key)       - Anahtar Kontrolü
- containsValue(Object value)   - Değer Kontrolü
- keySet()                      - Anahtarlar
- values()                      - Değerler
- entrySet()                    - Anahtar-Değer Çiftleri
- size()                        - Boyut
- isEmpty()                     - Boşluk Kontrolü
- clear()                       - Temizleme



  LocalDate Metodları
-------------------
- now()                                     - Bugün
- of(int year, int month, int dayOfMonth)   - Tarih Oluşturma
- parse(CharSequence text)                  - Dizeyi Parse Etme
- plusDays(long days)                       - Gün Ekleme
- minusDays(long days)                      - Gün Çıkarma
- getYear()                                 - Yıl
- getMonth()                                - Ay
- getDayOfMonth()                           - Gün
- isBefore(ChronoLocalDate other)           - Önce
- isAfter(ChronoLocalDate other)            - Sonra
- isLeapYear()                              - Artık Yıl

  LocalTime Metodları
---------------------
- now()                         - Şu An
- of(int hour, int minute)      - Saat Oluşturma
- parse(CharSequence text)      - Zaman Parse Etme
- plusHours(long hours)         - Saat Ekleme
- minusMinutes(long minutes)    - Dakika Çıkarma
- getHour()                     - Saat
- getMinute()                   - Dakika
- getSecond()                   - Saniye
- isBefore(LocalTime other)     - Önce
- isAfter(LocalTime other)      - Sonra

  LocalDateTime Metodları
-------------------------
- now()                                                         - Şu An
- of(int year, int month, int dayOfMonth, int hour, int minute) - Tarih-Saat Oluşturma
- parse(CharSequence text)                                      - Dizeyi Parse Etme
- plusDays(long days)                                           - Gün Ekleme
- minusHours(long hours)                                        - Saat Çıkarma
- getYear()                                                     - Yıl
- getMonth()                                                    - Ay
- getDayOfMonth()                                               - Gün
- getHour()                                                     - Saat
- getMinute()                                                   - Dakika
- isBefore(ChronoLocalDateTime<?> other)                        - Önce
- isAfter(ChronoLocalDateTime<?> other)                         - Sonra

  DateTimeFormatter Metodları
-----------------------------
- ofPattern(String pattern)             - Desen Oluşturma
- parse(CharSequence text)              - Dizeyi Parse Etme
- format(Temporal temporal)             - Formatlama
- ISO_LOCAL_DATE                        - Yerel Tarih
- ISO_LOCAL_TIME                        - Yerel Zaman
- ISO_LOCAL_DATE_TIME                   - Yerel Tarih-Saat
- ofLocalizedDate(FormatStyle style)    - Yerel Tarih Stili
- ofLocalizedTime(FormatStyle style)    - Yerel Zaman Stili


  Inheritance (Kalıtım) Metodları
  Object Sınıfından Gelen Metotlar
--------------------------------
- toString()            - Dize
- equals(Object obj)    - Eşitlik
- hashCode()            - Hash Kod
- getClass()            - Sınıf
- clone()               - Klonlama
- finalize()            - Çöp Toplama
- notify()              - Uyandırma
- notifyAll()           - Tümünü Uyandırma
- wait()                - Bekletme

  Kalıtımla Kullanılan Özel Anahtar Kelimeler
- super                 - Üst Sınıf
- this                  - Mevcut Sınıf
- @Override             - Geçersiz Kılma
- extends               - Kalıtım
- instanceof            - Tür Kontrolü
- protected             - Koruma



  Abstract Sınıflar Metotları
---------------------------
  Abstract sınıflar, soyut metotlar içeren ve alt sınıflar
  tarafından genişletilmesi gereken sınıflardır.

- Abstract Metotlarla İlgili Kavramlar
- abstract method - Tanımsız Metot
- concrete method - Tanımlı Metot
- extends - Kalıtım
- @Override - Geçersiz Kılma
- protected - Koruma
- public - Genel Erişim

  Abstract Sınıflar ile İlgili Örnek Metot Türleri
- Abstract Metot - Tanımsız, Gövdesiz Metot
- Concrete Metot - Gövdesi Olan Metot



  Iterator Metotları
------------------
  Java Iterator ve Iterable arayüzleri, koleksiyonlar üzerinde gezinmek için kullanılır.

  Iterator Metotları
- hasNext()     - Sonraki Eleman Kontrolü
- next()        - Sonraki Elemanı Getir
- remove()      - Eleman Sil

  Iterable Metotları
- iterator()    - Iterator Nesnesi Döndür



  Interface Metodları
-------------------
  Java'daki arayüzler (interface), soyut metotlar ve statik sabitler içeren yapılar olup,
  bir sınıfın hangi metotları sağlaması gerektiğini belirtir.

  Interface İçindeki Metot Türleri
- Abstract Method   - Soyut Metot
- Default Method    - Varsayılan Metot
- Static Method     - Statik Metot
- Private Method    - Özel Metot

  Interface Metotları
- abstract              - Tanımsız Metot
- default               - Varsayılan Metot Gövdesi
- static                - Statik Metot Gövdesi
- private               - Özel Yardımcı Metot
- @FunctionalInterface  - Fonksiyonel Arayüz Anotasyonu

  Interface'deki soyut metotlar gövdesizdir ve implementasyon sınıfında @Override ile
  geçersiz kılınmalıdır. Varsayılan ve statik metotlar, Java 8 ile eklenmiştir ve arayüzde
  gövdeye sahip olabilir.


     */
}




