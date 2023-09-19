import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
 * их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList();
        contacts.add(new Contact("Helen", "Ivanova", "89169161616", "12.12.1984"));
        contacts.add(new Contact("Ivan", "Petrov", "89159151515", ""));
        contacts.add(new Contact("Petr", "", "89129121212", "05.05.1980"));
        contacts.add(new Contact("Helen", "Ivanova", "89139131313", "12.12.1984"));


        Comparator<Contact> compareByPhoneNumber = new Comparator<Contact>() {
            public int compare(Contact o1, Contact o2) {
                return o1.phoneNumber.compareTo(o2.phoneNumber);
            }
        };

        Collections.sort(contacts,Collections.reverseOrder(compareByPhoneNumber));
        Book.printBook(contacts);


    }
}






