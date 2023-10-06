public interface Account {
    public void deposit(int amount);

    public void withdraw(int amount);

    public void transfer(int amount, Account targetAccount);

    public int getAccountNumber();
}