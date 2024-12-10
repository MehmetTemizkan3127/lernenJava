package j20statickeyword;

public class C07StaticBlock {

    public static void main(String[] args) {

        //Ayakkabının fiyatını çağır:
        System.out.println("Shop.shoes = " + Shop.shoes);

        Shop shop = new Shop();
        Shop shop2 = new Shop();

        Shop.hello();



    }

}
