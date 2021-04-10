package exceptions.exercise2;

public class CustomClass {


    public void doSomething(int value,String parameter)throws CustomException {
        if (value > 5){
            throw new CustomException(parameter);
        }
    }
}
