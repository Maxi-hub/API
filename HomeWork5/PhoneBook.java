import java.util.*;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
 * их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class PhoneBook {
    public HashMap<String, ArrayList<String>> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.putIfAbsent(name, new ArrayList<>());
        contacts.get(name).add(phoneNumber);
        Collections.sort(contacts.get(name), Collections.reverseOrder());
        }
        public List<String> getContact(String name) {
        return contacts.get(name);
    }


    @Override
    public String toString() {
        return "PhoneBook" + contacts;

    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Helen", "9169161616");
        phoneBook.addContact("Timofey", "9139131313");
        phoneBook.addContact("Helen", "9129121212");
        phoneBook.addContact("Petr", "9149141414");

        System.out.println(phoneBook.toString());

    }
}
