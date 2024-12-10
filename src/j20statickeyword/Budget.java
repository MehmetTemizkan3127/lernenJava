package j20statickeyword;

public class Budget {

    static double familyBudget = 500;
    double pocketMoney;

    void getMoneyFromBudget(int money) {
        if (money >= 0) {
            if (familyBudget >= money) {
                familyBudget -= money;
                pocketMoney += money;
            } else {
                System.out.println("There is no enough money in the family budget!");
            }
        } else {
            System.out.println("Money can not be negative!");
        }
    }

    void earnMoney(double money) {//Herkes kazandığı paranın yarısını aile bütçesine verecek.
        if (money >= 0) {
            familyBudget += money / 2;
            pocketMoney += money / 2;
        } else {
            System.out.println("Money can not be negative!");
        }
    }

    static void spendMoneyFromFamilyBudget(double money) {
        if (familyBudget >= money) {
            familyBudget -= money;
        } else {
            System.out.println("There is no enough money!");
        }
    }


}
