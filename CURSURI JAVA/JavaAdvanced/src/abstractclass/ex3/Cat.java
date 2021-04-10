package abstractclass.ex3;

public class Cat extends Animal {

    private final static int LEGS = 4;

    public Cat(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking with"+LEGS +" legs.");
    }
}
