public class VendingMachine {
    private VendingMachineState currentState;
    private int productCode;
    private int productPrice;
    private int balance;

    public VendingMachine() {
        currentState = new IdleState(this);
    }

    public void setCurrentState(VendingMachineState state) {
        currentState = state;
    }

    public void selectProduct(int productCode) {
        currentState.selectProduct(productCode);
    }

    public void insertTaka(int amount) {
        currentState.insertTaka(amount);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}