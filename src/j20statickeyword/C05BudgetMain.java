package j20statickeyword;

public class C05BudgetMain {

    public static void main(String[] args) {

        Budget father = new Budget();
        System.out.println("father.pocketMoney = " + father.pocketMoney);//0
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);//500
        father.getMoneyFromBudget(150);
        System.out.println("father.pocketMoney = " + father.pocketMoney);//150

        System.out.println("Budget.familyBudget = " + Budget.familyBudget);//350

        Budget mother = new Budget();
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);//0
        mother.getMoneyFromBudget(200);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);

        System.out.println("Budget.familyBudget = " + Budget.familyBudget);//150

        Budget daughter = new Budget();
        daughter.getMoneyFromBudget(100);
        System.out.println("daughter.pocketMoney = " + daughter.pocketMoney);//100
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);//50

        daughter.earnMoney(300);
        System.out.println("daughter.pocketMoney = " + daughter.pocketMoney);//250
        father.earnMoney(600);
        System.out.println("father.pocketMoney = " + father.pocketMoney);//450

        Budget.spendMoneyFromFamilyBudget(300);
        Budget.spendMoneyFromFamilyBudget(500);

        System.out.println("Budget.familyBudget = " + Budget.familyBudget);//-300
    }

}
