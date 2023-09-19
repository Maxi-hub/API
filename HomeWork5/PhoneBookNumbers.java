import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
 * их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class PhoneBookNumbers {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> db = new HashMap<>();
        db.putIfAbsent("Anton", new ArrayList<>());
        db.get("Anton").add("9234567890");
        db.get("Anton").add("1876543210");
        db.get("Anton").add("8178182324");
        db.putIfAbsent("Irina", new ArrayList<>());
        db.get("Irina").add("9129131415");
        for (Map.Entry<String, ArrayList<String>> entry : db.entrySet()) {
            Collections.sort(db.get(entry.getKey()));
            Collections.reverse(db.get(entry.getKey()));

        }
        System.out.println(db);

    }
}