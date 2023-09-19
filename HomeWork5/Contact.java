import java.util.Collection;

public class Contact {
    String name;
    String surname;
    String phoneNumber;
    String birthday;

    public Contact(String name, String surname, String phoneNumber, String birthday) {

        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

}





