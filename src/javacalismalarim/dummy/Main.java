package javacalismalarim.dummy;

class S1 {
     void display(int x, int y) {
        System.out.println("Parent display: " + x*2 + ", " + y);
    }
}

class S2 extends S1 {
    void display(int x, int y) {
        super.display(x,y); // Parent metodunu çağırıyoruz!
        System.out.println("Child display: " + x*2 + ", " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        S2 obj = new S2();
        obj.display(10,5); // Hangi metodlar çalışacak?
    }
}
