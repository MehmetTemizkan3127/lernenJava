package j101homework.inheritance.inheritance05circle;

public class Circle extends Shape{

 double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double area(){

       return Math.PI * Math.pow(radius, 2);

    }

}
