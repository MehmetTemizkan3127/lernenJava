package j101homework.önceki.j102mentoring.ikincibölüm;

public class M_1108_02 {
    public static void main(String[] args) {

        /*for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }*/
        int i = 1;
        while (i <= 10) {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
