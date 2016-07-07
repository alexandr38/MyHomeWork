package week1.contact_list;

/**
 * Created by serhii on 26.06.16.
 */
public class TestContactList {

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        Contact contact = new Contact();
        contact.initContact("Serhii", "0933091219");
        contactList.addContact(contact);

        contact.initContact("sashko", "0933091219");
        contactList.addContact(contact);

        contact.initContact("mikola", "0973091219");
        contactList.addContact(contact);

        contact.initContact("nikita", "097091219");
        contactList.addContact(contact);

        contact.initContact("petrik", "0933091219");
        contactList.addContact(contact);

        System.out.println(contactList.asJson());
    }
}
