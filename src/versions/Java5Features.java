package versions;
import java.util.*;

public class Java5Features {
    public static void run() {
        System.out.println("=== Java 5 Features ===");
        // Generics + enhanced-for + autoboxing
        List<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        for (String n : names) {
            System.out.println("Name: " + n);
        }

        // Enum
        Day d = Day.MONDAY;
        System.out.println("Enum Day: " + d);

        // Varargs & autoboxing example
        System.out.println("Sum: " + sum(1,2,3));
    }

    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    static int sum(int... nums) {
        int s = 0;
        for (int n : nums) s += n;
        return s;
    }
}
