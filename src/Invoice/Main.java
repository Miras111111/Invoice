package Invoice;

public class Main {
    public static void main(String[] args) {
        Account account1 = new CheckingAccount(100000);
        account1.addMoney(20000);
        account1.pay(10000);
        Account account2 = new CreditAccount(0);
        account1.transfer(account2, 30000);

//        Account account2 = new CreditAccount(0);
//        account2.pay(30000);
//        account2.addMoney(250000);
//        account2.transfer(account1,30000);

//        Account account3 = new SavingAccount(300000);
//        account3.transfer(account1,20000);
//        account3.addMoney(30000);
//        account3.pay(20000);
    }
}
