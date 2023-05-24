import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        String slash = "/////////////////////////////////";

        // Queue
        Queue<Person> superMarket = new LinkedList<>();
        superMarket.add(new Person("Oğuzhan", 23));
        superMarket.add(new Person("Ahmet", 32));
        superMarket.add(new Person("Ayşe", 56));

        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());
    }

    record Person(String name, int age) {

    }
}