package benimcalismalarim.dummy;

public class VarargsKaralamalari {
    public static double calculateTotal(double... numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }


    public static double calculateDifference(double... numbers) {
        if (numbers.length == 0) {

            return 0.0;
        }
        double difference = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            difference -= numbers[i];
        }
        return difference;
    }


    public static double calculateMultiply(double... numbers) {
        if (numbers.length == 0) {

            return 1.0;
        }
        double product = 1.0;
        for (double number : numbers) {
            product *= number;

        }
        return product;
    }

    public static double divide(double... numbers) {
        if (numbers.length < 2) {

            return 0.0;
        }
        double section = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println();
                return 0.0;
            }
            section /= numbers[i];
        }
        return section;
    }


    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        double total = 0.0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;

    }


    public static void main(String[] args) {
        System.out.println("Toplam : " + calculateTotal(8.75, 4.32, 5.86));
        System.out.println("Toplam : " + calculateTotal());

        System.out.println();

        System.out.println("Cikarma : " + calculateDifference(4.28, 2.14, 1.1, 0.04));
        System.out.println("Cikarma : " + calculateDifference());

        System.out.println();

        System.out.println("Carpim : " + calculateMultiply(8, 9, 12));
        System.out.println("Carpim : " + calculateMultiply());

        System.out.println();

        System.out.println("Bölme : " + divide(100, 2, 5, 2, 5));
        System.out.println("Bölme : " + divide());

        System.out.println();

        System.out.println("Ortalama : " + calculateAverage(20, 40, 10, 8, 2));
        System.out.println("Ortalama : " + calculateAverage());
    }
}
