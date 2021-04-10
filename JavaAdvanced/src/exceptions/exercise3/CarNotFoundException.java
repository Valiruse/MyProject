package exceptions.exercise3;

public class CarNotFoundException extends Exception{

    private String parameterName;
    private String parameterValue;

    public CarNotFoundException(String parameterName, String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    public String getParameterName() {
        return parameterName;
    }

    public String getParameterValue() {
        return parameterValue;
    }
}
