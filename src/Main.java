import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String slash = "/////////////////////////////////";

        // List And ArrayList

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Pink");
        System.out.println("Size: " + colors.size());
        System.out.println(colors);
        System.out.println(slash);
        colors.add("Yellow");
        System.out.println("Size: " + colors.size());
        System.out.println(colors);
        System.out.println(slash);
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println(slash);
        colors.forEach(System.out::println);
        System.out.println(slash);
        List<String> colorsUnmodifiable = List.of("blue", "pink");
//        colorsUnmodifiable.add("Brown");
    }
}