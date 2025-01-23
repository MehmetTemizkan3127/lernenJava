package j30maps.tasks01;


import java.util.HashMap;
import java.util.Map;

public class Task06 {
    public static void main(String[] args) {

        //    Bir şirketin çalışanlarının departman bilgileri bir HashMap ile saklanmaktadır:
        //    Ahmet = IT, Ayşe = HR, Mehmet = Finance, Fatma = IT
        //    entrySet metodunu kullanarak bu çalışanları ve departmanlarını ekrana yazdırın.
        //    Çıktı, her bir çalışan ve departmanını yeni bir satırda göstermelidir.

        Map<String , String> employes = new HashMap<>();
        employes.put("Ahmet" , "IT");
        employes.put("Ayse" ,"HR");
        employes.put("Mehmet" , "Finance");
        employes.put("Fatma" , "IT");


        for (Map.Entry<String, String> isci : employes.entrySet()) {
            System.out.println(isci.getKey() + " = " + isci.getValue());
        }

    }
}
