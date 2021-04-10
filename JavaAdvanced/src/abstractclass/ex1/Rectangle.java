package abstractclass.ex1;

public class Rectangle extends Shape {

    private static final int NUMBER_SIDES = 4;

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(NUMBER_SIDES);
        this.width = width;
        this.height = height;
    }


    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public int getPerimeter() {
        return 2 * (width + height);
    }
}
