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
            } else if (choice == 8) {
                showFirstFiveContact();
            } else if (choice == 9){
                showLastFiveContact();
            } else if (choice == 0){
                break;
            }
        }
    }

    private void showLastFiveContact(){
        if (contactList.getSize()<= 5){
            showAllContactsMenu();
        } else System.out.println(contactList.asString(contactList.getSize()-5,5));
    }

    private void showFirstFiveContact() {
        if (contactList.getSize()<= 5){
            showAllContactsMenu();
        } else System.out.println(contactList.asString(0,5));
    }

    private void showUpdateContactInfo() {
        System.out.println("Input index contact for update");
        int index = scanner.nextInt();

        if (!(checkIndexTrue(index))){
            System.out.println("bad index");
        } else {
            while (true){
                showUpdateMenu();

                int choice = scanner.nextInt();

                if (choice == 1){
                    contactList.setContactName(addName(),index);
                } else if (choice == 2){
                    contactList.setContactPhone(addPhone(),index);
                } else if (choice == 3){
                    Contact contact = new Contact();
                    contact.initContact(addName(),addPhone());
                    contactList.setContact(contact,index);
                } else if (choice == 0){
                    break;
                }
            }
        }
    }

    private void showUpdateMenu(){
        System.out.println("1. update name");
        System.out.println("2. update phone");
        System.out.println("3. update contact");
        System.out.println("0. exit");
    }

    private String addPhone(){
        boolean truePhone = false;
        String newPhone = "";

        while (!truePhone){
            System.out.println("Input phone");
            String phone = scanner.next();

            if (chekPhone(phone)) {
                truePhone = true;
                newPhone = phone;
            } else {
                System.out.println("incorrect phone. phone must have only number and length 9 - 12 symbols");
            }
        }
        return newPhone;
    }

    private boolean chekPhone (String phone){

        boolean chPhone = (phone.length()>=9 && phone.length()<=12);

        for (int i = 0; i < phone.length()&& chPhone; i++){
            if ( !(Character.isDigit(phone.charAt(i)))){
                chPhone = false;
            }
        }
        return chPhone;
    }

    private String addName(){

        String newName = "";

        while (true){
            System.out.println("Input name");
            String name = scanner.next();

            if (!chekNameAlfabet(name)) {
                System.out.println("name must have only A-Z, a-z");
            } else if (!chekCopyName(name)){
                newName = name;
                break;
            } else System.out.println("this name is used");
        }
        return newName;
    }

    // check index
    public boolean checkIndexTrue(int index){
        return index <= (contactList.getSize() - 1);
    }


    private boolean chekNameAlfabet (String name){
        boolean chName = true;

        for (int i = 0; i < name.length()&& chName; i++){
            if ( !(Character.isAlphabetic(name.charAt(i)))){
                chName = false;
            }
        }
        return chName;
    }

    private boolean chekCopyName(String name) {
        return !(contactList.findContactByName(name)== -1);
    }

    private void showRemoveContact() {
        while (true){
            System.out.println("Input name contact for remove ");
            String name = scanner.next();

            if (!chekNameAlfabet(name)){
                System.out.println("name must have only A-Z, a-z");
            } else if (!chekCopyName(name)){
                System.out.println("contact not found");
            } else {
                contactList.removeContact(contactList.findContactByName(name));
            }
            break;
        }
    }


    private void showFindContact (){
        System.out.println("Input contact name");
        String contactName = scanner.next();

        int contactPos = contactList.findContactByName(contactName);
        if (contactPos == -1){
            System.out.println("contact not found");
        } else {
            System.out.println(contactList.getContact(contactPos).toJson());
        }
    }

    private void showRemoveLastContact (){
        contactList.removeLastContact();
    }

    private void showContactDetailsMenu() {
        System.out.println("Input contact position");
        int postion = scanner.nextInt();

        if (checkIndexTrue(postion)){
            System.out.println(contactList.getContact(postion).toJson());
        } else System.out.println("bad index");
    }

    private void showAllContactsMenu() {
        System.out.println(contactList.asString());
    }

    private void showAddContactMenu(){

        Contact contact = new Contact();
        contact.initContact(addName(),addPhone());
        contactList.addContact(contact);
    }


    private void showMainMenu(){
        System.out.println("1. Add Contact");
        System.out.println("2. Show All");
        System.out.println("3. Show contact details");
        System.out.println("4. remove last contact");
        System.out.println("5. find contact by name");
        System.out.println("6. remove contact by name");
        System.out.println("7. update contact");
        System.out.println("8. show first five contact");
        System.out.println("9. show last five contact");
        System.out.println("0. Exit");
    }

}
