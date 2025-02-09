package javacalismalarim.konutekrari;

import java.util.*;

public class SetQueue {
    public static void main(String[] args) {
        Set<String> hasSet = new HashSet<>();
        hasSet.add("Ali");
        hasSet.add("Yasemin");
        hasSet.add("Cemal");
        hasSet.add("Ahmet");
        hasSet.remove("Ahmet");
        System.out.println("HashSet listesi yazdiriliyor            = " + hasSet);

        Set<String> linkedHasSet = new LinkedHashSet<>();
        linkedHasSet.add("Ali");
        linkedHasSet.add("Yasemin");
        linkedHasSet.add("Cemal");
        System.out.println("LinkedHashSet listesi yazdiriliyor      = " + linkedHasSet);


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ali");
        treeSet.add("Yasemin");
        treeSet.add("Cemal");
        System.out.println("TreeSet listesi yazdiriliyor            = " + treeSet);

        System.out.println();

        HashSet<String> hasSet1 = new HashSet<>();
        hasSet1.add("Ali");
        hasSet1.add("Yasemin");
        hasSet1.add("Cemal");

        System.out.println("HashSet1 listesi yazdiriliyor           = " + hasSet1);

        LinkedHashSet<String> linkedHasSet1 = new LinkedHashSet<>();
        linkedHasSet1.add("Ali");
        linkedHasSet1.add("Yasemin");
        linkedHasSet1.add("Cemal");
        System.out.println("LinkedHasSet1 listesi yazdiriliyor      = " + linkedHasSet1);


        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Ali");
        treeSet1.add("Yasemin");
        treeSet1.add("Cemal");
        treeSet1.add("Salih");
        treeSet1.add("Yusuf");
        treeSet1.add("Kerim");

        System.out.println("TreeSet1 listesi yazdiriliyor           = " + treeSet1);

        System.out.println("Contains sonucu yazdiriliyor            = " +treeSet1.contains("Yasemin"));
        System.out.println("TreeSet1 bosmu  degilse false           = " +treeSet1.isEmpty());

        treeSet.retainAll(treeSet1);
        System.out.println("Ortak kesisenler                        = " +treeSet);


        //retain


        //QUEUE
        Queue<String> beklemeSirasi = new LinkedList<>();
        beklemeSirasi.offer("0");
        beklemeSirasi.add(null);
        beklemeSirasi.add("1");
        beklemeSirasi.addAll(Arrays.asList("2","3"));
        beklemeSirasi.addAll(List.of("4","5"));
        System.out.println("Queue listesi yazdiriliyor              = " + beklemeSirasi);
        System.out.println("Element ilk elemani getiriyor           = " +beklemeSirasi.element());
        System.out.println("Peek ilk elemani getiriyor              = " +beklemeSirasi.peek());







    }
}
