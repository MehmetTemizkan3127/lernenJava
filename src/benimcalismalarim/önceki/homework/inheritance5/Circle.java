package benimcalismalarim.önceki.homework.inheritance5;

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
