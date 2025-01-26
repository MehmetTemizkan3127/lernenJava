package javacalismalarim.sinavhazirliklari;

public class FaktöriyelHesaplama {
    public static void main(String[] args) {
        int sayi = 5;
        int faktöriyel = 1;
        for (int i = 1; i <= sayi; i++){
          faktöriyel *= i;
        }
        System.out.println("faktöriyel = " + faktöriyel);
    }
}
