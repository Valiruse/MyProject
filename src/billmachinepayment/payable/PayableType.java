package billmachinepayment.payable;

import billmachinepayment.bill.CurrencyType;

public interface PayableType {

    double getValue();

    CurrencyType getCurrency();

    boolean isFake();


}
