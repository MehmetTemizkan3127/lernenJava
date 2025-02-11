package j101homework.inheritance.inheritance04library;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<LibraryItem> library = new ArrayList<>();

        Book book1 = new Book("Java Programlama", 101, "Sefa Sorgulu", 300);
        Book book2 = new Book("Algoritmalar", 102, "Smith Müller", 250);

        Magazine magazine1 = new Magazine("Teknoloji Aylik", 201, 5, true);
        Magazine magazine2 = new Magazine("Bilim Haftalik", 202, 12, false);

        library.add(book1);
        library.add(book2);
        library.add(magazine1);
        library.add(magazine2);

        System.out.println("Dijital kütüphane ögeleri: ");
        System.out.println("----------------------------");
        for (LibraryItem item : library) {
            item.displayInfo();
            System.out.println("----------------------------");
        }
    }
}