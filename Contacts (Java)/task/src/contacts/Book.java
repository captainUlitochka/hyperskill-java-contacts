package contacts;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class Book {
    List<Contact> contactList;
    Utils utils = new Utils();
    private int nextId = 1;
    public void start() {
        contactList = new ArrayList<>();
        out.print(Messages.COMMAND_LIST.getMessage());
        showMenu();
        utils.reader.close();
    }

    private void showMenu() {
        String command;
        while (utils.reader.hasNextLine()) {
            command = utils.reader.nextLine();
            switch (command) {
                case "add" -> createContact();
                case "remove" -> removeContact();
                case "edit" -> editContact();
                case "count" -> countContacts();
                case "list" -> showContactsList();
                case "exit" -> {
                    return;
                }
                default -> System.out.println(Messages.INVALID_CMD.getMessage());
            }
            out.print(Messages.COMMAND_LIST.getMessage());
        }
    }

    private void showContactsList() {
        if (!contactList.isEmpty()) {
            for (Contact contact : contactList) {
                out.printf(
                        Messages.RECORD.getMessage(),
                        contact.getId(),
                        contact.getFirstName(),
                        contact.getLastName(),
                        contact.getPhoneNumber());
            }
        } else {
            out.printf(Messages.NOTHING_TO_DO.getMessage(), "show");
        }

    }

    private void countContacts() {
        out.printf(Messages.RECORDS_COUNT.getMessage(), contactList.size());
    }

    private void chooseContact(String command) {
        if (!contactList.isEmpty()) {
            showContactsList();
            out.print(Messages.SELECT_RECORD.getMessage());
            int recordId = utils.reader.nextInt();

            if (recordId < contactList.size() && recordId > 0) {
                //TODO: edit or remove implementation

            } else out.printf(Messages.INVALID_DATA.getMessage(), "record number");
        } else out.printf(Messages.NOTHING_TO_DO.getMessage(), command);

    }

    private void editContact() {

    }

    private void removeContact() {
    }

    private void createContact() {
        out.print(Messages.ENTER_NAME.getMessage());
        String firstName = utils.reader.nextLine();
        out.print(Messages.ENTER_SURNAME.getMessage());
        String lastName = utils.reader.nextLine();
        out.print(Messages.ENTER_NUMBER.getMessage());
        String number = utils.reader.nextLine();

        try {
            Contact contact = new Contact(nextId, firstName, lastName, number);
            nextId++;
            contactList.add(contact);
        } catch (Exception e) {
            out.println(e.getMessage());
        }

        out.printf(Messages.RECORD_SUCCESS.getMessage(), "added");
    }
}
