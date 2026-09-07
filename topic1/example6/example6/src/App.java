import com.contact.ContactHandler;
import com.contact.Person;

public class App {
    public static void main(String[] args) throws Exception {
        //MOck
        ContactHandler contactHandler = new ContactHandler();
        Person person1 = new Person("589438", "Mario", "Fernandez");
        Person person2 = new Person("342442", "Steph", "Tonio");
        Person person3 = new Person("123343", "Facu", "Lava");
        Person person4 = new Person("543455", "Manu", "Blanco");

        contactHandler.add(person1);
        contactHandler.add(person2);
        contactHandler.add(person3);
        contactHandler.add(person4);
        contactHandler.showList();
        System.out.println("---------- testing search --------");
        Person person = contactHandler.search("543455");
        person.print();
        contactHandler.remove("543455");
        System.out.println("---------- remove Manu --------");
        contactHandler.showList();

    }
}
