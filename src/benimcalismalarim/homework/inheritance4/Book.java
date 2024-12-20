package benimcalismalarim.homework.inheritance4;

public class Book extends LibraryItem {

    String author;
    int pages;

    public Book() {

    }

    public Book(String title, int itemId, String author, int pages) {
        super(title, itemId);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author      : " + author);
        System.out.println("Pages       : " + pages);
    }
}