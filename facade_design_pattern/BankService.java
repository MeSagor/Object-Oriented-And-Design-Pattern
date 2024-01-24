import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, Account> bankAccounts;

    public BankService() {
        bankAccounts = new Hashtable<Integer, Account>();
    }

    public int createNewAccount(String type, int initBalance) {
        Account newAccount = null;
        if (type.equalsIgnoreCase("saving")) {
            newAccount = new SavingsAccount(this.bankAccounts.size(), initBalance);
        } else if (type.equalsIgnoreCase("chequing")) {
            newAccount = new ChequingAccount(this.bankAccounts.size(), initBalance);
        } else if (type.equalsIgnoreCase("investment")) {
            newAccount = new InvestmentAccount(this.bankAccounts.size(), initBalance);
        } else {
            System.out.println("Invalide account type");
        }
        if (newAccount != null) {
            bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    public void depositMoney(int accountNumber, int amount) {
        Account account = bankAccounts.get(accountNumber);
        account.deposit(amount);
    }

    public void withdrawMoney(int accountNumber, int amount) {
        Account account = bankAccounts.get(accountNumber);
        account.withdraw(amount);
    }

    public void transferMoney(int senderAccountNumber, int reciverAccountNumber, int amount) {
        Account senderAccount = this.bankAccounts.get(senderAccountNumber);
        Account reciverAccount = this.bankAccounts.get(reciverAccountNumber);
        senderAccount.transfer(amount, reciverAccount);
    }
}
