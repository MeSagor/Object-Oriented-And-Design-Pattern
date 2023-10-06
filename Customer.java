public class Customer {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        int mySavingAccount = bankService.createNewAccount("saving", 500);
        int myChequingAccount = bankService.createNewAccount("chequing", 1000);
        int myInvestmentAccount = bankService.createNewAccount("investment", 700);

        bankService.transferMoney(mySavingAccount, myChequingAccount, 700);

        bankService.depositMoney(mySavingAccount, 1300);
        bankService.withdrawMoney(mySavingAccount, 200);

        bankService.transferMoney(mySavingAccount, myChequingAccount, 700);
        bankService.transferMoney(myChequingAccount, myInvestmentAccount, 1500);
    }
}
