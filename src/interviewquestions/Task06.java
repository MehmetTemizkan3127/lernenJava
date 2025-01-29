package interviewquestions;

import java.util.HashSet;

public class Task06 {
    public static void main(String[] args) {


        String kelime = "yazilim dünyasi";
        System.out.println(findFirstRepeatingChar(kelime));
    }

    public static char findFirstRepeatingChar(String str) {
        HashSet<Character> tekrar = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!tekrar.add(ch))
                return ch;
        }
        return '\0';
    }
}
