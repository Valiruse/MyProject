package abstractclass.ex1;

public abstract class Shape {

    private int numberSides;

    public Shape(int numberSides){
        this.numberSides=numberSides;
    }

    public abstract int getArea();

    public abstract int getPerimeter();

    public int getNumberSides() {
        return numberSides;
    }
}
