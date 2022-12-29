package PhoneBook;
import java.util.*;

public class Phonebook {
    ArrayList<Person> phonebook = new ArrayList<>();

    public void add(String name, int phone) {
        Person random = new Person();
        random.Name = name;
        random.PhoneNumber = phone;
        phonebook.add(random);
    }

    public boolean search(String name){
        for (Person person : phonebook) {
            if (person.Name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void delete(String name) {
        for (Person person : phonebook) {
            if (person.Name.equals(name)) {
                phonebook.remove(person);
                break;
            }
        }
    }
        
}
