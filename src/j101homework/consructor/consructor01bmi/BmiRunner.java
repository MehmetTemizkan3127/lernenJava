package j101homework.consructor.consructor01bmi;

public class BmiRunner {
    public static void main(String[] args) {

        Bmi person = new Bmi("John Doe", 25, 70, 1.75);

        System.out.println("1- Name: " + person.getName());
        System.out.println("2- Age: " + person.getAge());
        System.out.println("3- Weight: " + person.getWeight() + " kg");
        System.out.println("4- Height: " + person.getHeight() + " m");
        System.out.printf("5- BMI: %.2f\n", person.getBMI());
        System.out.println("6- Status: " + person.getStatus());



        // Printing person details using the toString method
       // System.out.println(person); ==> Referansini yazdirir
    }
}