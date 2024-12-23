package benimcalismalarim.önceki.sablonlar;

public class DenemeSorular {
    public static void main(String[] args) {

       /* Basit Sorular
        // 1.	İki Sayının Toplamını Bulma
        Kullanıcının girdiği iki sayıyı toplamak için bir program oluşturun. Toplama yöntemini açıklayın.
        2.	Bir Kelimenin Uzunluğunu Hesaplama
        Kullanıcının girdiği bir kelimenin uzunluğunu hesaplayan bir program oluşturun. Uzunluk hesaplama yöntemini açıklayın.
        3.	Harf ve Sayı Kontrolü
        Kullanıcının girdiği bir string'in içindeki harf ve sayı sayısını kontrol edin. Kontrol yöntemlerini açıklayın.
        4.	Bir String'i Harf Harf Yazdırma
        Kullanıcının girdiği bir string'i harf harf yazdıran bir program yazın. Yazdırma yöntemini açıklayın.
        5.	Bir Sayının Tek mi Çift mi Olduğunu Kontrol Etme
        Kullanıcının girdiği bir sayının tek mi çift mi olduğunu kontrol eden bir program yazın. Kontrol yöntemini açıklayın.
        6.	Bir Sayının Karekökünü Hesaplama
        Kullanıcının girdiği bir sayının karekökünü hesaplayan bir program yazın. Karekök hesaplama yöntemini açıklayın.
        7.	Harflerin Frekans Dağılımını Hesaplama
        Kullanıcının girdiği bir kelimede her bir harfin kaç kez geçtiğini hesaplayan bir program oluşturun. Frekans dağılımı hesaplama yöntemini açıklayın.
        8.	Yüzde Hesaplama
        Kullanıcının girdiği bir değerin yüzdesini hesaplayın. Yüzde hesaplama formülünü açıklayın.
        Orta Düzey Sorular
        9.	Zaman Hesaplama
        Kullanıcının girdiği saat ve dakikaları alarak toplam süreyi hesaplayın. Zaman hesaplama yöntemini açıklayın.
        10.	Bir Tarihin Güncel Durumunu Kontrol Etme
        Kullanıcının girdiği tarihin gelecekte mi yoksa geçmişte mi olduğunu kontrol eden bir program yazın. Tarih kontrol yöntemini açıklayın.
        11.	Kullanıcıdan Bir Dizi Girmesini İsteme
        Kullanıcıdan bir tam sayı dizisi girmesini isteyerek, bu dizinin toplamını hesaplayın. Girdi alma yöntemini açıklayın.
        12.	Bir Dizi İçin Toplam ve Ortalama Hesaplama
        Kullanıcının girdiği bir dizi tam sayının toplamını ve ortalamasını hesaplayan bir program oluşturun. Hesaplama yöntemlerini açıklayın.
        13.	Bir String'deki Harflerin Sıklığını Hesaplama
        Kullanıcının girdiği bir string'deki harflerin sıklığını hesaplayan bir program oluşturun. Sıklık hesaplama yöntemini açıklayın.
        14.	Dizi Elemanlarının Ortalaması
        Kullanıcının girdiği bir dizideki elemanların ortalamasını hesaplayın. Ortalama hesaplama yöntemini açıklayın.
        15.	Çift ve Tek Sayı Listesi Oluşturma
        Kullanıcının girdiği bir aralıktaki çift ve tek sayıları listeleyen bir program yazın. Listeleme yöntemlerini açıklayın.
        16.	Dizi Elemanlarını Döngü ile Yazdırma
        Kullanıcının girdiği bir dizi elemanını döngü kullanarak yazdıran bir program oluşturun. Döngü kullanımı yöntemini açıklayın.
        17.	Küçükten Büyüğe Sıralama
        Kullanıcının girdiği bir dizi tam sayıyı küçükten büyüğe sıralayın. Sıralama yöntemini açıklayın.
        18.	Harflerin Sayısını Bulma
        Kullanıcının girdiği bir string'de belirli bir harfin kaç kez geçtiğini hesaplayın. Sayma yöntemini açıklayın.
        19.	Sayıların Faktöriyelini Hesaplama
        Kullanıcının girdiği bir sayının faktöriyelini hesaplayan bir program yazın. Faktöriyel hesaplama yöntemini açıklayın.
        İleri Düzey Sorular
        20.	Bir Ürünün İndirimli Fiyatını Hesaplama
        Kullanıcının girdiği bir ürün fiyatı ve indirim oranıyla, indirimli fiyatı hesaplayan bir program oluşturun. İndirim hesaplama yöntemini açıklayın.
        21.	Aylık Gelir ve Gider Hesaplama
        Kullanıcının aylık gelirini ve giderlerini girmesi durumunda, net geliri hesaplayan bir program oluşturun. Hesaplama yöntemini açıklayın.
        22.	Bir Sayının Mükemmel Olup Olmadığını Kontrol Etme
        Kullanıcının girdiği bir sayının mükemmel sayı olup olmadığını kontrol eden bir program oluşturun. Mükemmel sayı tanımını açıklayın.
        23.	Çarpanlar ve Katlar
        Kullanıcının girdiği bir sayının çarpanlarını ve katlarını listeleyen bir program oluşturun. Çarpanlar ve katlar arasındaki ilişkiyi açıklayın.
        24.	Zaman Aralığını Hesaplama
        Kullanıcının girdiği başlangıç ve bitiş saatleri arasındaki süreyi hesaplayan bir program yazın. Zaman hesaplama yöntemini açıklayın.
        25.	Kullanıcının Cinsiyetine Göre Mesaj Gönderme
        Kullanıcıdan cinsiyet bilgisi alarak, ona uygun bir mesaj gösteren bir program oluşturun. Mesaj özelleştirme yöntemini açıklayın.
        26.	Bir Dizi Elemanının En Büyük Değerini Bulma
        Kullanıcının girdiği bir dizi elemanının en büyük değerini bulan bir program oluşturun. Bulma yöntemini açıklayın.
        27.	Kullanıcının Tercihine Göre Renk Seçimi
        Kullanıcının renk tercihine göre (örneğin kırmızı, mavi, yeşil) bir mesaj gösteren bir program yazın. Renk seçimi yöntemini açıklayın.
        28.	Kullanıcıdan Girdi Alarak Oyun
        Bilgisayarın rastgele seçtiği bir sayıyı tahmin etmek için kullanıcıdan girdi alarak puanlama sistemi ekleyin. Oyun kurallarını ve puanlama sistemini açıklayın.
        29.	Bir Tarih Aralığında Kaç Gün Olduğunu Hesaplama
        Kullanıcının girdiği iki tarih arasındaki gün sayısını hesaplayan bir program yazın. Gün hesaplama yöntemini açıklayın.



        Zor Sorular
        30.	Üçgenin Kenar Uzunluklarıyla Kontrolü
        Kullanıcının girdiği üç kenar uzunluğuna göre bir üçgenin var olup olmadığını kontrol edin. Üçgen kontrolü yöntemlerini açıklayın.
        31.	Farklı Birimlerde Uzunluk Dönüşümü
        Kullanıcının girdiği bir uzunluğu (örneğin, metreyi) başka birime (örneğin, santimetreye) dönüştüren bir program yazın. Dönüşüm formülünü açıklayın.
        32.	Kelime Sayısını Bulma
        Kullanıcının girdiği bir cümledeki kelime sayısını hesaplayın. Kelime sayma yöntemini açıklayın.
        33.	Bir Kelimenin Anlamını Sözlükten Bulma
        Kullanıcının girdiği bir kelimenin anlamını bulmasını sağlayan basit bir sözlük uygulaması oluşturun. Anlamları depolama yöntemini açıklayın.
        34.	Bir String’in Vowel (Sesli Harf) Sayısını Bulma
        Kullanıcının girdiği bir string'deki sesli harfleri sayan bir program oluşturun. Sesli harflerin belirlenme yöntemini açıklayın.
        35.	Bir Kelimenin Tüm Permutasyonlarını Bulma
        Kullanıcının girdiği bir kelimenin tüm permutasyonlarını bulan bir program oluşturun. Permutasyon hesaplama yöntemini açıklayın.
        36.	Kütüphane Kitap Arama
        Kullanıcının kütüphanedeki kitapları arayarak bulmasını sağlayan bir sistem oluşturun. Arama yöntemlerini açıklayın.
        37.	Bir String'in Sadece Benzersiz Harflerini Bulma
        Kullanıcının girdiği bir string'deki benzersiz harfleri bulan bir program yazın. Benzersiz harfleri bulma yöntemini açıklayın.
        38.	Harf ve Sayı Karışımı String'lerde Geçerli Olanları Kontrol Etme
        Kullanıcının girdiği bir string'in sadece harf ve rakam içerip içermediğini kontrol eden bir program yazın. Kontrol yöntemini açıklayın.
        39.	Dizi Elemanlarının Arasındaki Farkı Bulma
        Kullanıcının girdiği bir dizinin elemanları arasındaki farkı hesaplayan bir program yazın. Fark hesaplama yöntemini açıklayın.
        40.	Bir String'in Palindrom Olup Olmadığını Kontrol Etme
        Kullanıcının girdiği bir string'in palindrom olup olmadığını kontrol eden bir program yazın. Palindrom kontrol yöntemini açıklayın.
        Ek Zor Sorular
        41.	Takvim Uygulaması Oluşturma
        Kullanıcının belirttiği tarihlere göre takvim oluşturan bir program yazın. Takvim oluşturma yöntemini açıklayın.
        42.	Müzik Listesi Yönetimi
        Kullanıcıdan müzik parçalarını eklemesini, silmesini ve görüntülemesini sağlayan bir uygulama oluşturun. Liste yönetimi yöntemlerini açıklayın.
        43.	Fibonacci Dizisini Hesaplama
        Kullanıcının girdiği bir sayıya kadar olan Fibonacci dizisini hesaplayan bir program yazın. Fibonacci dizisi hesaplama yöntemini açıklayın.
        44.	Çift Dizi Oluşturma
        Kullanıcının girdiği bir diziden sadece çift sayıları alarak yeni bir dizi oluşturan bir program yazın. Dizi oluşturma yöntemini açıklayın.
        45.	Kullanıcıdan Üç Kenar Uzunluğu Girişi
        Kullanıcının girdiği üç kenar uzunluğuna göre bir üçgenin var olup olmadığını kontrol edin. Üçgen kontrol yöntemlerini açıklayın.
        46.	İki Tarih Arasındaki Farkı Hesaplama
        Kullanıcının girdiği iki tarih arasındaki farkı hesaplayan bir program yazın. Tarih farkı hesaplama yöntemini açıklayın.
        47.	Bir Ürünün Toplam Fiyatını Hesaplama
        Kullanıcının girdiği bir ürün fiyatı ve miktarına göre toplam fiyatı hesaplayan bir program yazın. Hesaplama yöntemini açıklayın.
        48.	Bir Metin Dosyasındaki Kelime Sayısını Bulma
        Belirtilen bir metin dosyasındaki toplam kelime sayısını hesaplayan bir program oluşturun. Kelime sayma yöntemini açıklayın.
        49.	Yılın İlk Çeyreğini Kontrol Etme
        Kullanıcının girdiği bir tarihin yılın ilk çeyreğine ait olup olmadığını kontrol eden bir program oluşturun. Çeyrek kontrol yöntemini açıklayın.
        50.	Yılın Son Çeyreğini Kontrol Etme
        Kullanıcının girdiği bir tarihin yılın son çeyreğine ait olup olmadığını kontrol eden bir program yazın. Çeyrek kontrol yöntemini açıklayın.
        En Zor Sorular
        51.	Kullanıcının Cinsiyetine Göre Emeklilik Hesaplama
        Kullanıcının cinsiyetine ve yaşına göre emeklilik durumunu kontrol eden bir program yazın. Emeklilik hesaplama yöntemini açıklayın.
        52.	Bir Dizi Elemanını Şu Anki Dizi ile Karşılaştırma
        Kullanıcının girdiği bir dizi elemanını mevcut dizinin elemanlarıyla karşılaştırarak eşleşme kontrolü yapan bir program yazın. Karşılaştırma yöntemini açıklayın.
        53.	Çarpanları Bulma
        Kullanıcının girdiği bir sayının çarpanlarını bulan bir program yazın. Çarpan bulma yöntemini açıklayın.
        54.	Harf ve Sayı Karışımı String'lerde Geçerli Olanları Kontrol Etme
        Kullanıcının girdiği bir string'in sadece harf ve rakam içerip içermediğini kontrol eden bir program yazın. Kontrol yöntemini açıklayın.
        55.	Bir Kelimenin Anlamını Sözlükten Bulma
        Kullanıcının girdiği bir kelimenin anlamını bulmasını sağlayan basit bir sözlük uygulaması oluşturun. Anlamları depolama yöntemini açıklayın.
        56.	Kullanıcıdan Üç Kenar Uzunluğu Girişi
        Kullanıcının girdiği üç kenar uzunluğuna göre bir üçgenin var olup olmadığını kontrol edin. Üçgen kontrol yöntemlerini açıklayın.
        57.	Bir String'deki Sayıları Bulma
        Kullanıcının girdiği bir string'deki tüm sayıları bulan bir program oluşturun. Sayıları bulma yöntemini açıklayın.
        58.	İki Tarih Arasındaki Farkı Hesaplama
        Kullanıcının girdiği iki tarih arasındaki farkı hesaplayan bir program yazın. Tarih farkı hesaplama yöntemini açıklayın.
        59.	Zaman Hesaplama
        Kullanıcının girdiği saat ve dakikaları alarak toplam süreyi hesaplayın. Zaman hesaplama yöntemini açıklayın.
        60.	Bir Metin Dosyasındaki Kelime Sayısını Bulma
        Belirtilen bir metin dosyasındaki toplam kelime sayısını hesaplayan bir program oluşturun. Kelime sayma yöntemini açıklayın.
        Ekstra Zor Sorular
        61.	Bir String'deki Vowel ve Consonant Sayısını Bulma
        Kullanıcının girdiği bir string'deki sesli ve sessiz harflerin sayısını hesaplayan bir program yazın. Sayma yöntemini açıklayın.
        62.	Bir Fibonacci Dizisini Hesaplama
        Kullanıcının girdiği bir sayıya kadar olan Fibonacci dizisini hesaplayan bir program yazın. Fibonacci dizisi hesaplama yöntemini açıklayın.
        63.	Bir String'i Tersine Çevirme
        Kullanıcının girdiği bir string'i tersine çeviren bir program oluşturun. Ters çevirme yöntemini açıklayın.
        64.	Bir Ürünün Toplam Fiyatını Hesaplama
        Kullanıcının girdiği bir ürün fiyatı ve miktarına göre toplam fiyatı hesaplayan bir program yazın. Hesaplama yöntemini açıklayın.
        65.	Bir Dizi İçindeki Elemanların Çarpımını Hesaplama
        Kullanıcının girdiği bir dizi tam sayının çarpımını hesaplayan bir program oluşturun. Çarpım hesaplama yöntemini açıklayın.
        66.	Bir Dizi Elemanlarının Ortalamasını Hesaplama
        Kullanıcının girdiği bir dizi elemanının ortalamasını hesaplayan bir program yazın. Ortalama hesaplama yöntemini açıklayın.
        67.	Bir String'deki Tüm Sayıları Bulma
        Kullanıcının girdiği bir string'deki tüm sayıları bulan bir program oluşturun. Sayıları bulma yöntemini açıklayın.
        68.	Harf ve Sayı Karışımı String'lerde Geçerli Olanları Kontrol Etme
        Kullanıcının girdiği bir string'in sadece harf ve rakam içerip içermediğini kontrol eden bir program yazın. Kontrol yöntemini açıklayın.
        69.	Kullanıcının Cinsiyetine Göre Mesaj Gönderme
        Kullanıcıdan cinsiyet bilgisi alarak, ona uygun bir mesaj gösteren bir program oluşturun. Mesaj özelleştirme yöntemini açıklayın.
        70.	Bir String'in Palindrom Olup Olmadığını Kontrol Etme
        Kullanıcının girdiği bir string'in palindrom olup olmadığını kontrol eden bir program yazın. Palindrom kontrol yöntemini açıklayın.
        Zor Sorular
        71.	İki Tarih Arasındaki Farkı Hesaplama
        Kullanıcının girdiği iki tarih arasındaki farkı hesaplayan bir program yazın. Tarih farkı hesaplama yöntemini açıklayın.
        72.	Zaman Hesaplama
        Kullanıcının girdiği saat ve dakikaları alarak toplam süreyi hesaplayın. Zaman hesaplama yöntemini açıklayın.
        73.	Bir Tarihin Güncel Durumunu Kontrol Etme
        Kullanıcının girdiği tarihin gelecekte mi yoksa geçmişte mi olduğunu kontrol eden bir program yazın. Tarih kontrol yöntemini açıklayın.
        74.	Bir String'in Vowel (Sesli Harf) Sayısını Bulma
        Kullanıcının girdiği bir string'deki sesli harfleri sayan bir program oluşturun. Sesli harflerin belirlenme yöntemini açıklayın.
        75.	Küçükten Büyüğe Sıralama
        Kullanıcının girdiği bir dizi tam sayıyı küçükten büyüğe sıralayın. Sıralama yöntemini açıklayın.
        76.	Bir String'in Harflerini Tersine Çevirme
        Kullanıcının girdiği bir string'in harflerini tersine çeviren bir program yazın. Ters çevirme yöntemini açıklayın.
        77.	Sayıların Faktöriyelini Hesaplama
        Kullanıcının girdiği bir sayının faktöriyelini hesaplayan bir program yazın. Faktöriyel hesaplama yöntemini açıklayın.
        78.	Çift ve Tek Sayı Listesi Oluşturma
        Kullanıcının girdiği bir aralıktaki çift ve tek sayıları listeleyen bir program yazın. Listeleme yöntemlerini açıklayın.
        79.	Bir Dizi Elemanlarının Arasındaki Farkı Bulma
        Kullanıcının girdiği bir dizinin elemanları arasındaki farkı hesaplayan bir program yazın. Fark hesaplama yöntemini açıklayın.
        80.	Kullanıcıdan Bir Dizi Girmesini İsteme
        Kullanıcıdan bir tam sayı dizisi girmesini isteyerek, bu dizinin toplamını hesaplayın. Girdi alma yöntemini açıklayın.
        Daha Zor Sorular
        81.	Zaman Aralığını Hesaplama
        Kullanıcının girdiği başlangıç ve bitiş saatleri arasındaki süreyi hesaplayan bir program yazın. Zaman hesaplama yöntemini açıklayın.
        82.	Farklı Birimlerde Uzunluk Dönüşümü
        Kullanıcının girdiği bir uzunluğu (örneğin, metreyi) başka birime (örneğin, santimetreye) dönüştüren bir program yazın. Dönüşüm formülünü açıklayın.
        83.	Çarpanlar ve Katlar
        Kullanıcının girdiği bir sayının çarpanlarını ve katlarını listeleyen bir program oluşturun. Çarpanlar ve katlar arasındaki ilişkiyi açıklayın.
        84.	Müzik Listesi Yönetimi
        Kullanıcıdan müzik parçalarını eklemesini, silmesini ve görüntülemesini sağlayan bir uygulama oluşturun. Liste yönetimi yöntemlerini açıklayın.
        85.	Kelime Sayısını Bulma
        Kullanıcının girdiği bir cümledeki kelime sayısını hesaplayın. Kelime sayma yöntemini açıklayın.
        86.	Harflerin Frekans Dağılımını Hesaplama
        Kullanıcının girdiği bir kelimede her bir harfin kaç kez geçtiğini hesaplayan bir program oluşturun. Frekans dağılımı hesaplama yöntemini açıklayın.
        87.	Bir Ürünün İndirimli Fiyatını Hesaplama
        Kullanıcının girdiği bir ürün fiyatı ve indirim oranıyla, indirimli fiyatı hesaplayan bir program oluşturun. İndirim hesaplama yöntemini açıklayın.
        88.	Kullanıcının Cinsiyetine Göre Emeklilik Hesaplama
        Kullanıcının cinsiyetine ve yaşına göre emeklilik durumunu kontrol eden bir program yazın. Emeklilik hesaplama yöntemini açıklayın.
        89.	Takvim Uygulaması Oluşturma
        Kullanıcının belirttiği tarihlere göre takvim oluşturan bir program yazın. Takvim oluşturma yöntemini açıklayın.
        90.	Bir String'in Palindrom Olup Olmadığını Kontrol Etme
        Kullanıcının girdiği bir string'in palindrom olup olmadığını kontrol eden bir program yazın. Palindrom kontrol yöntemini açıklayın.

        En Zor Sorular
        91.	Kullanıcının Tercihine Göre Renk Seçimi
        Kullanıcının renk tercihine göre (örneğin kırmızı, mavi, yeşil) bir mesaj gösteren bir program yazın. Renk seçimi yöntemini açıklayın.
        92.	İki Sayının EBOB'unu Hesaplama
        Kullanıcının girdiği iki sayının EBOB'unu hesaplayan bir program oluşturun. EBOB hesaplama yöntemini açıklayın.
        93.	Küçükten Büyüğe Sıralama
        Kullanıcının girdiği bir dizi tam sayıyı küçükten büyüğe sıralayın. Sıralama yöntemini açıklayın.
        94.	Harflerin Sayısını Bulma
        Kullanıcının girdiği bir string'de belirli bir harfin kaç kez geçtiğini hesaplayın. Sayma yöntemini açıklayın.
        95.	Yüzde Hesaplama
        Kullanıcının girdiği bir değerin yüzdesini hesaplayın. Yüzde hesaplama formülünü açıklayın.
        96.	Zaman Hesaplama
        Kullanıcının girdiği saat ve dakikaları alarak toplam süreyi hesaplayın. Zaman hesaplama yöntemini açıklayın.
        97.	Bir String'deki Harflerin Sıklığını Hesaplama
        Kullanıcının girdiği bir string'deki harflerin sıklığını hesaplayan bir program oluşturun. Sıklık hesaplama yöntemini açıklayın.
        98.	Kullanıcıdan Üç Kenar Uzunluğu Girişi
        Kullanıcının girdiği üç kenar uzunluğuna göre bir üçgenin var olup olmadığını kontrol edin. Üçgen kontrol yöntemlerini açıklayın.
        99.	Kullanıcıdan Bir Dizi Girmesini İsteme
        Kullanıcıdan bir tam sayı dizisi girmesini isteyerek, bu dizinin toplamını hesaplayın. Girdi alma yöntemini açıklayın.
        100.	Bir Tarihin Güncel Durumunu Kontrol Etme
        Kullanıcının girdiği tarihin gelecekte mi yoksa geçmişte mi olduğunu kontrol eden bir program yazın. Tarih kontrol yöntemini açıklayın. */
    }
}