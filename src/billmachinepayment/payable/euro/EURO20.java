package billmachinepayment.payable.euro;

import billmachinepayment.bill.CurrencyType;
import billmachinepayment.payable.EuroBanknote;

public class EURO20 extends EuroBanknote {

    private final static double LENGTH_MM=133;

    private final static double WIDTH_MM=72;
    private static final int VALUE = 20;


    public EURO20(double receivedLength, double receivedWidth) {
        super(140, 77, receivedLength, receivedWidth);
    }

    @Override
    public double getValue() {
        return VALUE;
    }


}
