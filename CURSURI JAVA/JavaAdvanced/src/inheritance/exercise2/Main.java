package inheritance.exercise2;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[4];

        animals[0] = new Animal();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Dog();


        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal at index " + i + " yieldVoice is: "+animals[i].yieldVoice());

        }

    }

}
