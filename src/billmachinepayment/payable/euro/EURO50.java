package billmachinepayment.payable.euro;

import billmachinepayment.bill.CurrencyType;
import billmachinepayment.payable.EuroBanknote;

public class EURO50 extends EuroBanknote {

    private final static double LENGTH_MM=140;

    private final static double WIDTH_MM=77;
    private static final int VALUE = 50;


    public EURO50( double receivedLength, double receivedWidth) {
        super(140, 77, receivedLength, receivedWidth);
    }

    @Override
    public double getValue() {
        return VALUE;
    }

}
