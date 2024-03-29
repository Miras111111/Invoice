package Invoice;

public class CheckingAccount extends Account {
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        balance = balance - amount;
        account.balance = account.balance + amount;
        System.out.println("Ваш баланс: " + balance + "\n" + "Баланс получателя: " + account.balance);
    }

    @Override
    public void addMoney(int amount) {
        if (amount >= 0) {
            balance = balance + amount;
            System.out.println("Ваш счет: " + balance);
        }
    }

    @Override
    public void pay(int amount) {
        balance = balance - amount;
        System.out.println("Ваш счет: " + balance);
    }
}
