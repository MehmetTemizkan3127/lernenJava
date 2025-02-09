package j99codechallenge.codechallenge03;

public class Task07 {
    public static void main(String[] args) {

        String sentence = "java programming is fun";
        String result = "";


        for (int i = 0; i < sentence.length(); i++) {
            if (i == 0 || sentence.charAt(i - 1) == ' ') {
                result += sentence.substring(i, i + 1).toUpperCase();
            } else {
                result += sentence.substring(i, i + 1);
            }
        }

        System.out.println(result);

    }
}
