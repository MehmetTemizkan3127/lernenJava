package javacalismalarim.sinavhazirliklari;

public class Dummy {
    public static void main(String[] args) {
        String name = "Mehmet";
        String tersName = "";
        for (int i = name.length()-1; i >= 0;i--){
            tersName += name.charAt(i);
        }
        System.out.println("tersName = " + tersName);

        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());
    }
}
