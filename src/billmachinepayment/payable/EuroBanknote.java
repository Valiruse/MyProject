package billmachinepayment.payable;

import billmachinepayment.bill.CurrencyType;

public abstract class EuroBanknote extends Banknote {

    public EuroBanknote(double length, double width, double receivedLength, double receivedWidth) {
        super(length, width, receivedLength, receivedWidth);
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }

}

