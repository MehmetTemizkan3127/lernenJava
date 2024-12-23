package benimcalismalarim.önceki.konular;

public class J9BreakandContinue {
    /*
    09- Break and Continue
Tanım:
break ve continue komutları, döngülerde kullanılan kontrol yapılarıdır. Bu komutlar, döngülerin akışını değiştirmeye yarar.

Break Komutu:
break komutu döngüyü veya switch ifadesini sonlandırır.
Döngü, belirli bir koşul sağlandığında erken sonlanır.
java
Kodu kopyala
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // i 5 olduğunda döngü sonlanır
    }
    System.out.println(i);
}
Continue Komutu:
continue komutu, döngüdeki mevcut yinelemeyi sonlandırır ve bir sonraki yinelemeye geçer.
Bu komut, döngünün geriye kalan kısmını atlar.
java
Kodu kopyala
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue; // i 5 olduğunda bu yineleme atlanır
    }
    System.out.println(i);
}
Komut	Kullanım	Etkisi
break	Döngüyü veya switch bloğunu sonlandırır.	Döngüyü erken bitirir, kontrol dışına çıkar.
continue	Mevcut yinelemeyi atlar, döngünün bir sonraki yinelemesine geçer.	Bir sonraki döngü turuna geçer.
Önemli Not:
break yalnızca döngü veya switch bloğunun bulunduğu blok içerisinde çalışır.
continue, döngüdeki yalnızca mevcut yinelemeyi atlar. Yani, döngü tamamlanmaz, ama bir sonraki adım başlar.
Konu Özeti:
break, döngüyü erken bitirirken, continue sadece geçerli döngü turunu atlar.
İhtiyacınıza göre doğru komutu kullanmak önemlidir, çünkü yanlış kullanıldığında döngü kontrolünü zorlaştırabilir.

     */
}
