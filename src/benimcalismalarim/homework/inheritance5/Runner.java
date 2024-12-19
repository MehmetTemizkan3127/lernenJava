package benimcalismalarim.homework.inheritance5;

public class Runner {

    public static void main(String[] args) {


        Shape shape = new Shape();
        Shape rectangle = new Rectangle(5.0, 7.2);
        Shape circle = new Circle(5.0);

        double shape1 = shape.area();
        double rectangle1 = rectangle.area();
        double circle1 = circle.area();

        System.out.println("Shape       = " + Math.round(shape1 * 100.0) / 100.0);
        System.out.println("Rectangle   = " + Math.round(rectangle1 * 100.0) / 100.0);
        System.out.println("Circle      = " + Math.round(circle1 * 100.0) / 100.0);


    }


}


