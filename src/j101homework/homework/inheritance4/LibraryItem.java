package j101homework.homework.inheritance4;

public class LibraryItem {

    String title;
    int itemId;

    public LibraryItem() {
    }

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    public void displayInfo() {
        System.out.println("Title       : " + title);
        System.out.println("Item ID     : " + itemId);
    }

}

