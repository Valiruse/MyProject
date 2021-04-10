package abstractclass.ex3;

public class Spider extends Animal {

    private final static int LEGS = 8;

    public Spider(int legs) {
        super(legs);
    }


    @Override
    public void walk() {
        System.out.println("Spider is walking with " + LEGS + " legs");
    }
}
