package contacts;

public enum Messages {
    COMMAND_LIST("Enter action (add, remove, edit, count, list, exit): "),
    RECORDS_COUNT("The Phone Book has %d records.%n"),
    ENTER_NAME("Enter the name of the person:"),
    ENTER_SURNAME("Enter the surname of the person:"),
    ENTER_NUMBER("Enter the number:"),
    RECORD_SUCCESS("The record %s."),
    NOTHING_TO_DO("No records to %s"),
    INVALID_DATA("Invalid %s"),
    INVALID_CMD("Invalid command!"),
    NO_NUMBER("[no number]"),
    WRONG_FORMAT("Wrong number format!"),
    SELECT_RECORD("Select a record: "),
    SELECT_FIELD("Select a field (name, surname, number): "),
    RECORD("%d. %s %s, %s%n");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
