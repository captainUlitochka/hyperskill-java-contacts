package contacts;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String inputFirstName, String inputLastName, String inputNumber) {
        setFirstName(inputFirstName);
        setLastName(inputLastName);
        setPhoneNumber(inputNumber);
    }
}
