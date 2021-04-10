package abstractclass.ex3;

public abstract class Animal {

    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void walk();

    public int getLegs() {
        return legs;
    }
}
