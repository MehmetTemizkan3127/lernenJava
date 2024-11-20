package j10_methodcreation.Tasks;

public class Task05 {
    public static void main(String[] args) {
           /*
    Task: Given two strings,
          String firstName = "John " and String lastName = "Doe ",
                trim any extra whitespace,
                concatenate the two names,
                and print the full name in uppercase.
     */
        String firstName = "John ";
        String lastName = "Doe ";

        String fullName = (firstName.strip() + " " + lastName.strip()).toUpperCase();

        System.out.println(fullName);

    }
}
