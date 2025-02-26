class Salesperson extends Person {
    private String salespersonID;

    public Salesperson(String salespersonID, String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        this.salespersonID = salespersonID;
    }

    public String getSalespersonID() {
        return salespersonID;
    }
    public void setSalespersonID(String salespersonID) {
        this.salespersonID = salespersonID;
    }
    public void createInvoice() {
        System.out.println("Salesperson " + getSalespersonID() + " is creating an invoice.");
    }

    public void negotiateVehicle() {
        System.out.println("Salesperson " + getSalespersonID() + " is negotiating with a customer.");
    }
    @Override
    public String toString() {
        return "Salesperson ID: " + salespersonID + ", " + super.toString();
    }
}