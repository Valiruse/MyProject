package abstractclass.ex1;

import abstractclass.ex1.Shape;

public class Triangle extends Shape {

    private final static int NUMBER_SIDES = 3;

    private int l1;
    private int l2;
    private int l3;

    public Triangle(int l1, int l2, int l3) {
        super(NUMBER_SIDES);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public int getPerimeter() {
        return l1 + l2 + l3;
    }

    @Override
    public int getArea() {
        return l1 * l2 / 2;
    }
}
