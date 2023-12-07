package contacts;

import java.util.ArrayList;
import java.util.List;

public class Book {
    List<Contact> contactList;
    Utils utils = new Utils();

    public void start() {
        contactList = new ArrayList<>();
        createContact();
    }

    private void createContact() {
        System.out.println(Messages.ENTER_NAME.getMessage());
        String firstName = utils.reader.nextLine();
        System.out.println(Messages.ENTER_SURNAME.getMessage());
        String lastName = utils.reader.nextLine();
        System.out.println(Messages.ENTER_NUMBER.getMessage());
        String number = utils.reader.nextLine();
        Contact contact = new Contact(firstName, lastName, number);
        contactList.add(contact);
        System.out.println(Messages.RECORD_SUCCESS.getMessage());
        System.out.println(Messages.NUM_OF_NEW_RECORDS.getMessage());
    }
}
