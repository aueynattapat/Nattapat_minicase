public class TradeIn {
    private String tradeInVehicleInfo;
    private double tradeInAllowance;

    public TradeIn(String tradeInVehicleInfo, double tradeInAllowance) {
        this.tradeInVehicleInfo = tradeInVehicleInfo;
        this.tradeInAllowance = tradeInAllowance;
    }

    public String getTradeInVehicleInfo() {
        return tradeInVehicleInfo;
    }
    public void setTradeInVehicleInfo(String tradeInVehicleInfo) {
        this.tradeInVehicleInfo = tradeInVehicleInfo;
    }

    public void setTradeInAllowance(double tradeInAllowance) {
        if (tradeInAllowance >= 0) {
            this.tradeInAllowance = tradeInAllowance;
        } else {
            System.out.println("Trade-in allowance cannot be negative.");
        }
    }

    @Override
    public String toString() {
        return "Trade-In Vehicle: " + tradeInVehicleInfo + ", Allowance: $" + tradeInAllowance;
    }
}
