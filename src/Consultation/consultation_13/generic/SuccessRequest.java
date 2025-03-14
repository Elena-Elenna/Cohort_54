package Consultation.consultation_13.generic;

public class SuccessRequest {
    String message;

    public SuccessRequest(String text) {
        this.message = text;
    }

    public String getValue() {
        return message;
    }
}
