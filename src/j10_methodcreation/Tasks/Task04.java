package j10_methodcreation.Tasks;

public class Task04 {
    public static void main(String[] args) {
         /*
    Task: Create two strings representing scores in this format:
                 String score1 = "Player1: 89 points",
                 String score2 = "Player2: 93 points".
          Extract the numeric values from each string, convert them to integers,
          and compare them. Print the player with the higher score.
    Hint: Use substring() and Integer.parseInt().
     */

        String score1 = "Player1: 89 points";
        String score2 = "Player2: 93 points";

// Extract numeric values and convert to integers

// Compare and print the player with the higher score

        String scoreYeni = score1.substring(9);
        String scoreSon = scoreYeni.replaceAll("\\D", "");

        String scoreYeni2 = score2.substring(9);
        String scoreSon2 = scoreYeni2.replaceAll("\\D", "");

        int score11 = Integer.parseInt(scoreSon);
        int score22 = Integer.parseInt(scoreSon2);

        if (score11 > score22) {
            System.out.println(score11 + " daha büyük skora sahip");
        } else if (score11 < score22) {
            System.out.println(score22 + " daha büyük skora sahip");

        } else {
            System.out.println("Beraberlik");

        }
}
}
