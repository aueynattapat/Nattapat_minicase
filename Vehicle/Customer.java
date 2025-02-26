class Customer extends Person {
    private String customerID;

    public Customer(String customerID, String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public void getInvoice() {
        System.out.println("Generating invoice for customer: " + getName());
    }
    public void negotiateVehicle() {
        System.out.println(getName() + " is negotiating a vehicle.");
    }

    public void requestTradeIn() {
        System.out.println(getName() + " has requested a trade-in.");
    }
    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", " + super.toString();
    }
}