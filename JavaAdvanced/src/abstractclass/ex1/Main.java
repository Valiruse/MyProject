package abstractclass.ex1;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Rectangle(3, 7),
                new Triangle(8, 2, 9),
                new Rectangle(10, 6),
                new Triangle(5, 9, 13)
        };

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle){
                System.out.println("Perimeter is: " + shapes[i].getPerimeter());
                System.out.println("Area is: " + shapes[i].getArea());
                System.out.println("Number of sides: "+ shapes[i].getNumberSides());
            }

        }




    }
}
