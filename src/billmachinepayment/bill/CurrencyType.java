package billmachinepayment.bill;

public enum CurrencyType {

    EUR("Euro"),
    RON("Leu"),
    USD("Dolar");

    private String realName;

    CurrencyType(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return realName;
    }
}

