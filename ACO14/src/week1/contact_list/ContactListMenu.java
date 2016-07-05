package week1.contact_list;

import java.util.Scanner;

/**
 * Created by serhii on 26.06.16.
 */
public class ContactListMenu {

    private Scanner scanner = new Scanner(System.in);
    private ContactList contactList;
    
    public void start(ContactList contactList){

        this.contactList = contactList;

        while(true){
            showMainMenu();

            int choice = scanner.nextInt();

            if(choice == 1){
                showAddContactMenu();
            } else if(choice == 2){
                showAllContactsMenu();
            } else if(choice == 3){
                showContactDetailsMenu();
            } else if(choice == 0){
                break;
            }

        }
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
        System.out.println("0. Exit");
    }

}
