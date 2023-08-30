import java.util.*;

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

    private static void maps() {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person("alex", 23));
        personMap.put(2, new Person("morgan", 22));
        personMap.put(3, new Person("ozzy", 22));
        personMap.put(3, new Person("ozzyy", 22));
        System.out.println(personMap);
        System.out.println(personMap.size());
        System.out.println(personMap.get(2));
        System.out.println(personMap.get(4));
        System.out.println(personMap.containsKey(3));
        System.out.println(personMap.keySet());
        System.out.println(personMap.entrySet());
        personMap.entrySet().forEach(x -> System.out.println(x.getKey() + "-" + x.getValue()));
        personMap.forEach((key, person) -> System.out.println(key + " - " + person));
        personMap.remove(3);
        personMap.forEach((key, person) -> System.out.println(key + " - " + person));
        System.out.println(personMap.getOrDefault(4, new Person("default", 10)));
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