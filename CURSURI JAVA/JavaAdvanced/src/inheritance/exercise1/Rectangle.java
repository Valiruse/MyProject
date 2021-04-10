package inheritance.exercise1;

public class Rectangle extends Shape {
    private int radius;


    public Rectangle(int area,int perimeter,int radius){
        super(area,perimeter);
        this.radius=radius;

    }

}
