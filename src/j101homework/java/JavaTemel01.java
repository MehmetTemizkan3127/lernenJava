package j101homework.java;

public class JavaTemel01 {
    public static void main(String[] args) {
        // task02 -> JavaCAN kelimesini her harfini ayrı bir satira gelecek sekilde  print eden code create ediniz.
        String kelime = "JavaCAN";
        int i = 0;
        for (char harf : kelime.toCharArray()) {
            i++;
            System.out.println(i + ". harf        = " + harf);
        }
    }
}
