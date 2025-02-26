class Invoice {
    private String invoiceNumber;
    private Customer customer;
    private Vehicle vehicle;
    private double tradeInAllowance;
    private double dealerOptionsCost;
    private double taxes;
    private double licenseFees;
    private double finalPrice;

    public Invoice(String invoiceNumber, Customer customer, Vehicle vehicle, double tradeInAllowance, double dealerOptionsCost, double taxes, double licenseFees) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.vehicle = vehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.dealerOptionsCost = dealerOptionsCost;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.finalPrice = calculateFinalPrice();
    }
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    private double calculateFinalPrice() {
        return vehicle.getBaseCost() + dealerOptionsCost + taxes + licenseFees - tradeInAllowance;
    }

    public void requestDealerInstallOptions() {
        System.out.println("Requesting dealer-installed options for invoice " + invoiceNumber);
    }

    public void sumFinalNegotiatedPrice() {
        System.out.println("Final negotiated price: $" + finalPrice);
    }

    @Override
    public String toString() {
        return "Invoice No: " + invoiceNumber + "\nCustomer: " + customer.getCustomerID() + "\nVehicle: " + vehicle.getSerialNumber() + 
               "\nTrade-In Allowance: $" + tradeInAllowance + "\nDealer Options Cost: $" + dealerOptionsCost + 
               "\nTaxes: $" + taxes + "\nLicense Fees: $" + licenseFees + "\nFinal Price: $" + finalPrice;
    }
}