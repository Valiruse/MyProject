package abstractclass.ex3;

public class Main {

    public static void main(String[] args) {

        Animal spider = new Spider(8);
        Animal cat =new Cat(4);
        Animal fish =new Fish(0);

        spider.walk();
        cat.walk();
        fish.walk();
    }
}
