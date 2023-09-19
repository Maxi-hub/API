import java.util.ArrayList;
import java.util.HashMap;


public class Book {
    static HashMap<Integer, Contact> phoneNumbers = new HashMap<>();


    static void printBook(ArrayList<Contact> contacts) {
        for (int i = 0; i < contacts.size(); i++) {
            phoneNumbers.put(i, contacts.get(i));
            System.out.println("ID: " + i + "\n" + contacts.get(i).toString() + "\n");
        }
    }
}



