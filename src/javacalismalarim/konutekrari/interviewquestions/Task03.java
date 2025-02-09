package javacalismalarim.konutekrari.interviewquestions;

public class Task03 {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is Palindrome: " + isPalindrome(input));

    }

    private static String isPalindrome(String input) {

        input = input.toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            return "String Palindrome'dur";
        } else {
            return "String Palindrome degildir";
        }
    }
}