package billmachinepayment.payable.euro;

import billmachinepayment.bill.CurrencyType;
import billmachinepayment.payable.EuroBanknote;

public class EURO100 extends EuroBanknote {

    private final static double LENGTH_MM=147;

    private final static double WIDTH_MM=82;
    private static final int VALUE = 100;


    public EURO100(double receivedLength, double receivedWidth) {
        super(140, 77, receivedLength, receivedWidth);
    }

    @Override
    public double getValue() {
        return VALUE;
    }


}
