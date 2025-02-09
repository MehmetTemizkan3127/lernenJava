package javacalismalarim.konutekrari;

public class Yb02JavaNotlar {
    // trim ile strip ayni görevi görüyor.
    // isEmty ile isBlank benzer görevler görüyor (isEmty false-treu <--- " " ve "" ---> isBlank treu-treu)
    // String.format(%s seviyorum, str(Seni)).sout ---> Seni seviyorum
    // String.format(seviyorum %s, str(Seni)).sout ---> Seviyorum Seni

    //String.format(" %.2f", pi).sout ---> Virgüllü sayiyi azaltmada kullanilir.

    //ReplaceAll
    //replaceAll("\\s", "_") ===> Bosluklar kaldirildi
    //replaceAll("\\S", "*") ===> Bosluk disindaki karekterler kaldirildi

    //replaceAll("\\d", " ") ===> Sayilar kaldirildi
    //replaceAll("\\D", " ") ===> Sayilar disindaki karekterler kaldirildi

    //replaceAll("\\w", "#") ===> Harfler ve rakamlar degistirildi
    //replaceAll("\\W", "+") ===> Harf ve rakam disindaki karekterler degisti

    // Arrays Metodlari
    // 1- sort                  ===> Arrays.sort                                siralamak icin
    // 2- toString              ===> Arrays.toString(hayvanlar);                yazdirmak icin
    // 3- binarySearch}         ===> Arrays.binarySearch(hayvanlar, "Yilan");   kacinci indekste
    // 4- copyOf();             ===> Arrays.copyOf(hayvanlar, 8);               yeni Array'i copyalar genisletir.
    // 5- copyOfRange();        ===> Arrays.copyOfRange(hayvanlar1, 2,6);       iki indeks arasini alip yeni Array olusr
    // 6- equals()              ===> Arrays.equals(evcil, yabani)               iki diziyi karsilastirir
    // 7- fill();               ===> Arrays.fill(hayvanlar, "Kedi");            tüm Arrayin elemanlari Kedi olur
    // 8- asList();             ===> Arrays.asList(hayvanlar);                  Array'i List'e cevirir


    // ArrayList
    // 1- Collections.addAll(); ===> Collections.addAll(hayvanlar, "Kedi", "Yılan");    eleman ekleme
    // 2- Arrays.asList();      ===> ArrayList<String> hayvanlar = new ArrayList<>
    //                               (Arrays.asList("Kedi", "Köpek", "Kaplan", "Fil")); eleman ekleme
    // 3- List.of();            ===> ArrayList<String> hayvanlar = new ArrayList<>
    //                               (List.of("Kedi", "Köpek", "Kaplan", "Fil"));       eleman ekleme
    // 4- remove();             ===> yeniHayvanlar.remove(2);                           indeksle
    // 4- remove();             ===> yeniHayvanlar.remove("Balina");                    obje ile
    // 5- set                   ===> yeniHayvanlar1.set(0,"Kelebek");                   secilen indekse yeni eleman atanir
    // 6- get                   ===> yeniHayvanlar1.get(0);                             yeni degiskeni eleman olarak ceker
    // 7- size                  ===> yeniHayvanlar1.size();                             Array'in eleman sayisini verir
    // 8- clear();              ===> hayvanlar.clear();                                 secilen Arra''i temizler
    // 9-                       ===> yeniHayvanlar.contains                             yazilan metin var mi yokmu
    // 10                       ===> hayvanlar.isEmpty());                              Array bos mu degilmi


}