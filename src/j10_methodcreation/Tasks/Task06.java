package j10_methodcreation.Tasks;

public class Task06 {
    public static void main(String[] args) {
        //Task: Create a string String productCode = "A12B34C56".
        //Count how many digits are in the code and print the count.
        //Hint: Use replaceAll() to remove letters and check the
        //length of the resulting string.
        // Remove letters and count remaining characters


        String productCode = "A12B34C56";
        String digitsOnly = productCode.replaceAll("[A-Za-z]", "");
        int digitCount = digitsOnly.length();

        System.out.println("Number of digits: " + digitCount);


    }
}
