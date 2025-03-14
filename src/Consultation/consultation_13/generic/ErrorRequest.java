package Consultation.consultation_13.generic;

public class ErrorRequest {
    String message;

    public ErrorRequest(String message) {
        this.message = message;
    }

    public String getValue() {
        return message;
    }
}
