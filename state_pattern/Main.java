public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setProductPrice(50);

        vendingMachine.selectProduct(1);
        vendingMachine.insertTaka(25);
        vendingMachine.dispenseProduct();
        vendingMachine.selectProduct(2);
        vendingMachine.insertTaka(10);
        vendingMachine.insertTaka(25);
        vendingMachine.dispenseProduct();

        vendingMachine.selectProduct(2);
        vendingMachine.insertTaka(10);
        vendingMachine.insertTaka(25);
        vendingMachine.dispenseProduct();

    }
}