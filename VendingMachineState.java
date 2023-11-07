interface VendingMachineState {
    void selectProduct(int productCode);

    void insertTaka(int amount);

    void dispenseProduct();
}