package exceptions.exercise2;

public class CustomException extends Exception {

    private String parameter;

    public CustomException(String parameter){
        this.parameter=parameter;
    }

    public String getParameter() {
        return parameter;
    }
}
