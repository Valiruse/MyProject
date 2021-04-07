package billmachinepayment.bill;

public class Bill {

    private final String serialNumber;
    private final double amount;
    private final CurrencyType currency;

    public Bill(String serialNumber, double amount, CurrencyType currency) {
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.currency = currency;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public double getAmount() {
        return amount;
    }

    public CurrencyType getCurrency() {
        return currency;
    }
}
