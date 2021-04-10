package abstractclass.ex3;

public class Fish extends Animal {

    private final static int LEGS = 0;

    public Fish(int legs) {

        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("Fish is walking with " + LEGS + " legs.");
    }
}
