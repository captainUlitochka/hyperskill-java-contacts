package contacts;

public enum Messages {
    ENTER_NAME("Enter the name of the person:"),
    ENTER_SURNAME("Enter the surname of the person:"),
    ENTER_NUMBER("Enter the number:"),
    RECORD_SUCCESS("A record created!"),
    NUM_OF_NEW_RECORDS("A Phone Book with a single record created!"),
    INVALID_DATA("Invalid %s");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
