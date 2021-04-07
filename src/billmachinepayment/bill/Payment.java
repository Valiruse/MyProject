package billmachinepayment.bill;

import billmachinepayment.payable.PayableType;

public class Payment {

    private double amountCollected;
    private Bill bill;
    private PayableType[] payableCollected;
    private int currentPosition=0;

    public Payment(double amountCollected, Bill bill,PayableType[] payableCollected) {
        this.amountCollected = amountCollected;
        this.bill = bill;
        this.payableCollected=new PayableType[20];
    }

    public double getAmountCollected() {
        return amountCollected;
    }

    public boolean isPaid() {

        if (amountCollected >= bill.getAmount()) {
            return true;
        }
        return false;
    }

    public void addPayable(PayableType payable){
        if(payable.isFake()){
            System.out.println("Invalid payable");
        }else{
            amountCollected+= payable.getValue();
            payableCollected[currentPosition]= payable;
            currentPosition++;
        }

    }
}
