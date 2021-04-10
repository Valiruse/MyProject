package abstractclass.ex2;

public class Main {

    public static void main(String[] args) {

        Bank bA = new BankA();
        System.out.println(bA.getBalance());
        Bank bB = new BankB();
        System.out.println(bB.getBalance());
        Bank bC = new BankC();
        System.out.println(bC.getBalance());

    }
}
