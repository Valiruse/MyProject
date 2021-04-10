package exceptions.exercise2;

public class Main {

    public static void main(String[] args) {


        try {
            CustomClass customException = new CustomClass();
            customException.doSomething(3, "test");
        } catch (CustomException e){
            System.out.println(e.getParameter());
        }finally {
            System.out.println("Application Exit");

        }


    }
}
