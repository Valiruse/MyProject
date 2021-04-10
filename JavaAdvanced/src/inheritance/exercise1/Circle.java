package inheritance.exercise1;

public class Circle extends Shape {

    private int length;
    private int width;

    public Circle(int area, int perimeter, int length, int width) {
        super(length * length, 2 * (length + width));
        this.length = length;
        this.width = width;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
