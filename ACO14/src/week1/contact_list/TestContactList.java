package week1.contact_list;

/**
 * Created by serhii on 26.06.16.
 */
public class TestContactList {

    public static void main(String[] args) {

        ContactList contactList = new ContactList();

        Contact contact = new Contact();
        contact.initContact("Serhii", "0633091219");
        contactList.addContact(contact);

        Contact contact1 = new Contact();
        contact1.initContact("sashko", "0633091219");
        contactList.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.initContact("mikola", "0973091219");
        contactList.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.initContact("nikita", "097091219");
        contactList.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.initContact("petrik", "0933091219");
        contactList.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.initContact("alex", "0973091219");
        contactList.addContact(contact5);

        System.out.println(contactList.asJson());

        // first five contact
        System.out.println(contactList.asString(0,5));

        //last five contact
        System.out.println(contactList.asString(contactList.getSize() - 5,5));

        // kievstar
        System.out.println("kievstar");
        System.out.println(contactList.asString("097"));

        // kievstar
        System.out.println("life");
        System.out.println(contactList.asString("063"));

        // delete last
        contactList.removeLastContact();
        System.out.println("after del last (alex)");
        System.out.println(contactList.asString());

        // delete by name
        contactList.removeContact(contactList.findContactByName("sashko"));
        System.out.println("after del sashko");
        System.out.println(contactList.asString());

        // set contact name
        System.out.println("before change");
        System.out.println(contactList.getContact(2).asString());
        contactList.setContactName("kolobok",2);
        System.out.println("after change name");
        System.out.println(contactList.getContact(2).asString());

        // set contact telephone
        System.out.println("\n before change telephone");
        System.out.println(contactList.getContact(2).toJson());
        contactList.setContactPhone("065232323", 2);
        System.out.println("after change telephone");
        System.out.println(contactList.getContact(2).toJson());
    }
}
