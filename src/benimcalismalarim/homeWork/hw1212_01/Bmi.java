package benimcalismalarim.homeWork.hw1212_01;

public class Bmi {

    private String name;
    private int age;
    private double weight; // in kilograms
    private double height; // in meters


    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getBMI() {
        return weight / (height * height);
    }


    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Zayif";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "kilolu";
        } else {
            return "Obez";
        }
    }
}