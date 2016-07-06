package week1.contact_list;

/**
 * Created by serhii on 26.06.16.
 */
public class ContactList {

    // field
    private Contact[] list = new Contact[10];
    private int size = 0;

    public void addContact(Contact contact){
        if (size >= list.length && list.length > 0) {
            Contact[] temp = new Contact[list.length*2];
            System.arraycopy(list, 0, temp, 0, list.length);
            list = temp;
        }
        list[size] = contact;
        size++;
    }

    public Contact getContact(int position){
        return list[position];
    }

    public String asJson(){
        String result = "{ \n \tlist : [ ";

        for (int i = 0; i < size; i++) {
            Contact currContact = list[i];
            result += "\t\t" + currContact.toJson();
        }

        result += "\t\n]\n}";
        return result;
    }

    public String asString(){
        String result = "CONTACT LIST\n";

        for (int i = 0; i < size; i++) {
            Contact currContact = list[i];
            result += "\t" + i +". " + currContact.asString() + "\n";
        }

        return result;
    }




}
