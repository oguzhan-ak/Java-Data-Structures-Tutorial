import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        String slash = "/////////////////////////////////";

        // LinkedList
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Oğuzhan", 45));
        linkedList.add(new Person("Mehmet", 35));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
    }

    private static void queues() {
        LinkedList<Person> queue = new LinkedList<>();
        queue.add(new Person("Oğuzhan", 23));
        queue.add(new Person("Ahmet", 32));
        queue.add(new Person("Ayşe", 56));
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }

    record Person(String name, int age) {

    }
}