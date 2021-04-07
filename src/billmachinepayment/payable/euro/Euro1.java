package billmachinepayment.payable.euro;

import billmachinepayment.bill.CurrencyType;
import billmachinepayment.payable.Coin;

public class Euro1 extends Coin {

    private final static double WEIGHT_G=7.5;

    private final static double RADIUS_MM=23.25;

    private static final int VALUE = 1;

    public Euro1(double weight, double radius, double receivedWeight, double receivedRadius) {
        super(7.5,23.25, receivedWeight, receivedRadius);
    }

    @Override
    public double getValue() {
        return VALUE;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
