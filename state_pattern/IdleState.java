
public class IdleState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        vendingMachine.setBalance(0);
    }

    @Override
    public void selectProduct(int productCode) {
        vendingMachine.setProductCode(productCode);
        vendingMachine.setCurrentState(new ProductSelectedState(vendingMachine));
    }

    @Override
    public void insertTaka(int amount) {
        System.out.println("Please select a product first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first");
    }
    
    
}
