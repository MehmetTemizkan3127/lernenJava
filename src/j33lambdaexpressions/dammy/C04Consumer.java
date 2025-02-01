package j33lambdaexpressions.dammy;

import java.util.function.Consumer;

public class C04Consumer {
    public static void main(String[] args) {
        Consumer<String> strYazdir = string -> System.out.println("Metniniz = " + string);
        strYazdir.accept("Tek parametreli Consumer return etmiyor");
    }
}
