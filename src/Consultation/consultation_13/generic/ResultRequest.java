package Consultation.consultation_13.generic;

public class ResultRequest {
    public void process(Object object) {
        if (object instanceof SuccessRequest) {
            System.out.println("Мы получили " + ((SuccessRequest) object).getValue());
        } else if (object instanceof ErrorRequest) {
            System.out.println("Мы получили " + ((ErrorRequest) object).getValue());
        }
    }
}
