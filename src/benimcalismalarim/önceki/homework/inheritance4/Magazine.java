package benimcalismalarim.önceki.homework.inheritance4;

public class Magazine extends LibraryItem {

    int issueNumber;
    boolean monthly;

    public Magazine() {
    }

    public Magazine(String title, int itemId, int issueNumber, boolean monthly) {
        super(title, itemId);
        this.issueNumber = issueNumber;
        this.monthly = monthly;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Monthly     : " + (monthly ? "Yes" : "No"));

    }
}
