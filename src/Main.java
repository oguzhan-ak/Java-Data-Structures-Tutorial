import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
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

    private static void sets() {
        Set<Ball> balls = new HashSet<Ball>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        System.out.println(balls.size());
        System.out.println(balls.contains(new Ball("blue")));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        balls.forEach(System.out::println);
    }

    private static void linkedLists() {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Oğuzhan", 45));
        linkedList.add(new Person("Mehmet", 35));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
    }


    record Person(String name, int age) {

    }

    record Ball(String color) {

    }
}