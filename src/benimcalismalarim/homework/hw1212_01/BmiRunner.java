package benimcalismalarim.homework.hw1212_01;

public class BmiRunner {
    public static void main(String[] args) {

        Bmi person = new Bmi("John Doe", 25, 70, 1.75);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Weight: " + person.getWeight() + " kg");
        System.out.println("Height: " + person.getHeight() + " m");
        System.out.printf("BMI: %.2f\n", person.getBMI());
        System.out.println("Status: " + person.getStatus());



        // Printing person details using the toString method
        System.out.println(person);
    }
}