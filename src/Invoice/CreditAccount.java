package Invoice;

public class CreditAccount extends Account {

    public CreditAccount(int balance) {
        super(balance);
        if (balance > 0) {
            System.out.println("Кредитный счет не может быть положительным");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance <= 0) {
            System.out.println("No transfer");
        }
    }

    @Override
    public void addMoney(int amount) {
        if (balance <= 0) {
            if (balance + amount >= 0) {
                amount = balance + amount;
                balance = 0;
                System.out.println("Ваш кредитный счет: " + balance + "\n" + "Остаток: " + amount);
            } else {
                balance = balance + amount;
                System.out.println(balance);
            }
        }
    }

    @Override
    public void pay(int amount) {
        if (balance <= 0) {
            balance = -(balance + amount);
            System.out.println("Ваш текущий счет: " + balance);
        }
    }
}
