package week1.contact_list;

/**
 * Created by serhii on 26.06.16.
 */
public class TestContactLIstMenu {

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        ContactListMenu menu = new ContactListMenu();
        menu.start(contactList);
    }
}
