
public class ProductSelectedState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public ProductSelectedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(int productCode) {
        System.out.println("You have already selected a product");
        System.out.println("Please complete the current transaction for product " + vendingMachine.getProductCode());
    }

    @Override
    public void insertTaka(int amount) {
        vendingMachine.setBalance(vendingMachine.getBalance() + amount);
        System.out.println(amount + " taka inserted. Total balance: " + vendingMachine.getBalance() + " taka.");
    }

    @Override
    public void dispenseProduct() {
        int balance = vendingMachine.getBalance();
        int productPrice = vendingMachine.getProductPrice();

        if (balance >= productPrice) {
            vendingMachine.setBalance(balance - productPrice);
            System.out.println("Product " + vendingMachine.getProductCode() + "is dispensed.");
            if (balance - productPrice != 0) {
                System.out.println(balance - productPrice + " taka is returned.");
            }
            vendingMachine.setCurrentState(new IdleState(vendingMachine));
        } else {
            System.out.println("Insufficient balance. Please insert more taka.");
        }
    }

}
