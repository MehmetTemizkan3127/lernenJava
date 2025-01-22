package j101homework;
/*
    Task-> aşağıdaki çıktıyı print eden code create ediniz.
    Kiraz 100
    İncir 200
    Enginar 150
    Üzüm 145
    Nar 250

    */

import java.util.LinkedHashMap;

public class Task2201_02 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> meyveUcretleri = new LinkedHashMap<>();
        meyveUcretleri.put("Kiraz", 100);
        meyveUcretleri.put("Incir", 200);
        meyveUcretleri.put("Enginar", 150);
        meyveUcretleri.put("Üzüm", 145);
        meyveUcretleri.put("Nar", 250);

        for (String meyve : meyveUcretleri.keySet()) {
            System.out.println(meyve + " =" + meyveUcretleri.get(meyve));
        }
    }
}
