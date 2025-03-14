package Consultation.consultation_13.generic;

public class GenericApp {
    public static void main(String[] args) {
        Generic<String> str = new Generic<>();
        System.out.println("str = " + str.getValue());
        str.setValue("Hello");
        System.out.println("str = " + str.getValue());
        Generic<Integer> inVal = new Generic<>();
        System.out.println("intVal = " + inVal.getValue());
        inVal.setValue(123);
        System.out.println("intVal = " + inVal.getValue());
        System.out.println("======================================");

        Generic<CustomClass> customObj = new Generic<>();
        customObj.setValue(new CustomClass("Test"));
        System.out.println("customObj = " + customObj.getValue());

        System.out.println("======================================");
        ResultRequest request = new ResultRequest();
        ErrorRequest errorRequest = new ErrorRequest("Error of Request");
        SuccessRequest successRequest = new SuccessRequest("We have good access!");
        request.process(successRequest);
        System.out.println();
        request.process(errorRequest);
    }
}
