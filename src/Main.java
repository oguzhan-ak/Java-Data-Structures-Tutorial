import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String slash = "/////////////////////////////////";
        
        // Arrays
        String[] colors = new String[5];
        colors[0] = "asd";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[2]);
        System.out.println(slash);
        int[] numbers = {100, 200};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println(slash);
        Arrays.stream(colors).forEach(System.out::println);
        System.out.println(slash);
    }
}