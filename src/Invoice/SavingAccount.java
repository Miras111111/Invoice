package Invoice;

public class SavingAccount extends Account {
    public SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void transfer(Account account, int amount){
        balance = balance - amount;
        account.balance = account.balance + amount;
        System.out.println("Ваш баланс: " + balance + "\n" + "Баланс получателя: " + account.balance);
    }
    @Override
    public void addMoney(int amount){
        balance = balance + amount;
        System.out.println("Ваш баланс: " + balance);
    }
    @Override
    public void pay(int amount){
        if (amount < 0){
            System.out.println("Никак");
        } else {
            balance = balance - amount;
            System.out.println("Ваш баланс: " + balance);
        }
    }

}
