package Invoice;

abstract class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);
    public abstract void pay(int amount);
}
