package week1.contact_list;

/**
 * Created by serhii on 26.06.16.
 */
public class Contact {

    public String name;
    public String phone;

    public void initContact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String toJson() {
        // formatter
        return String.format("{name : %s, phone : %s}", name, phone);
    }
    
    public String asString(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}
