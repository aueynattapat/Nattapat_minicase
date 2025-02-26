public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "John Doe", "123 Main St", "555-1234");
        Vehicle vehicle = new Vehicle("V123", "SUV", "X5", 2023, "BMW", 60000);
        Salesperson salesperson = new Salesperson("S001", "Alice Smith", "456 Elm St", "555-5678");
        DealerInstalledOptions option = new DealerInstalledOptions("D001", "Sunroof", 1500);
        Invoice invoice = new Invoice("INV1001", customer, vehicle, 5000, 1500, 3000, 500);
        TradeIn trade = new TradeIn("Toyota Camry 2018", 8000.00);

        System.out.println(customer);
        System.out.println(vehicle);
        System.out.println(salesperson);
        System.out.println(option);
        System.out.println(invoice);
        System.out.println(trade);

        customer.getInvoice();
        salesperson.createInvoice();
        vehicle.createNewVehicleRecord();
        invoice.sumFinalNegotiatedPrice();
    }
}