package j101homework.inheritance.inheritance05circle;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }


    public double area(){

        return width*height;

    }
}
