package billmachinepayment.payable;

public abstract class Banknote implements PayableType {

    private final double length;
    private final double width;
    private final double receivedLength;
    private final double receivedWidth;

    public Banknote(double length, double width, double receivedLength, double receivedWidth) {
        this.length = length;
        this.width = width;
        this.receivedLength = receivedLength;
        this.receivedWidth = receivedWidth;
    }

    @Override
    public boolean isFake() {

        return length != receivedLength || width != receivedWidth;
    }
}
