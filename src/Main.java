import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    }

    private static void hashcode() {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Cemile"), new Diamond("African Diamond"));
        System.out.println(map.get(new Person("Cemile")));
        System.out.println(new Person("Cemile").hashCode());
        System.out.println(new Person("Cemile").hashCode());
    }

    private static void queues() {
        LinkedList<Person> queue = new LinkedList<>();
        queue.add(new Person("Oğuzhan"));
        queue.add(new Person("Ahmet"));
        queue.add(new Person("Ayşe"));
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
        personMap.put(1, new Person("alex"));
        personMap.put(2, new Person("morgan"));
        personMap.put(3, new Person("ozzy"));
        personMap.put(3, new Person("ozzyy"));
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
        System.out.println(personMap.getOrDefault(4, new Person("default")));
    }

    private static void linkedLists() {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Oğuzhan"));
        linkedList.add(new Person("Mehmet"));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
    }

    record Diamond(String name) {

    }

    record Ball(String color) {

    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}