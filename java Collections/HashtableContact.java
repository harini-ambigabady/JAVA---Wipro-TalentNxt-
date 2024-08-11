import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashtableContact {
    private Map<String, String> contactList;

    public HashtableContact() {
        contactList = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contactList.put(name, phoneNumber);
    }

    public boolean containsName(String name) {
        return contactList.containsKey(name);
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        return contactList.containsValue(phoneNumber);
    }

    public void displayContacts() {
        Iterator<Map.Entry<String, String>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashtableContact contactList = new HashtableContact();
        contactList.addContact("Alice", "+1234567890");
        contactList.addContact("Bob", "9876543210");
        contactList.addContact("Charlie", "1112223333");

        System.out.println(contactList.containsName("Alice")); // Output: true
        System.out.println(contactList.containsPhoneNumber("+1234567890")); // Output: true

        contactList.displayContacts();
    }
}
