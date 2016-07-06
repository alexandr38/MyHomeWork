package week1.contact_list;

import java.util.Scanner;

/**
 * Created by serhii on 26.06.16.
 */
public class ContactListMenu {

    private Scanner scanner = new Scanner(System.in);
    private ContactList contactList;
    
    public void start(ContactList contactList) {

        this.contactList = contactList;

        while (true) {
            showMainMenu();

            int choice = scanner.nextInt();

            if (choice == 1) {
                showAddContactMenu();
            } else if (choice == 2) {
                showAllContactsMenu();
            } else if (choice == 3) {
                showContactDetailsMenu();
            } else if (choice == 4) {
                showRemoveLastContact();
            } else if (choice == 5) {
                showFindContact();
            } else if (choice == 6) {
                showRemoveContact();
            } else if (choice == 7) {
                showUpdateContactInfo();
            } else if (choice == 0) {
                break;
            }
        }
    }

    private void showUpdateContactInfo() {
        System.out.println("Input name contact for update");
        String name = scanner.nextLine();

        int pos = contactList.findContactByName(name);

        if (pos == -1) {
            System.out.println("contact for update not found");
        } else {
            System.out.println("Input new name");
            String newName = scanner.nextLine();

            System.out.println("Input new phone");
            String newPhone = scanner.next();

            Contact contact = new Contact();
            contact.initContact(newName, newPhone);

            contactList.setContact(contact, pos);
        }

    }

    private void showRemoveContact() {
        System.out.println("Input index contact for remove ");
        int index = scanner.nextInt();

        contactList.removeContact(index-1);
    }

    private void showFindContact (){
        System.out.println("Input contact name");
        String contactName = scanner.nextLine();

        int contactPos = contactList.findContactByName(contactName);
        if (contactPos == -1){
            System.out.println("contact not found");
        } else {
            System.out.println(contactList.getContact(contactPos).asString());
        }
    }

    private void showRemoveLastContact (){
        contactList.removeLastContact();
    }

    private void showContactDetailsMenu() {
        System.out.println("Input contact position");
        int postion = scanner.nextInt();

        Contact contact = contactList.getContact(postion);
        System.out.println(contact.toJson());
    }

    private void showAllContactsMenu() {
        System.out.println(contactList.asString());
    }

    private void showAddContactMenu(){
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input phone");
        String phone = scanner.next();

        Contact contact = new Contact();
        contact.initContact(name,phone);
        contactList.addContact(contact);

    }


    private void showMainMenu(){
        System.out.println("1. Add Contact");
        System.out.println("2. Show All");
        System.out.println("3. Show contact details");
        System.out.println("4. remove last contact");
        System.out.println("5. find contact by name");
        System.out.println("6. remove contact by index");
        System.out.println("7. update contact");
        System.out.println("0. Exit");
    }

}
