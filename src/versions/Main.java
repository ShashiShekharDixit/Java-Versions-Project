package versions;
import java.util.*;
import java.lang.reflect.Method;

public class Main {
    private static final Map<Integer, Runnable> demos = new LinkedHashMap<>();
    static {
        demos.put(1, () -> Java5Features.run());
        demos.put(2, () -> Java6Features.run());
        demos.put(3, () -> Java7Features.run());
        demos.put(4, () -> Java8Features.run());
        demos.put(5, () -> Java9Features.run());
        demos.put(6, () -> Java10Features.run());
        demos.put(7, () -> Java11Features.run());
        demos.put(8, () -> Java12Features.run());
        demos.put(9, () -> Java13Features.run());
        demos.put(10, () -> Java14Features.run());
        demos.put(11, () -> Java15Features.run());
        demos.put(12, () -> Java16Features.run());
        demos.put(13, () -> Java17Features.run());
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a Java version demo to run (1-13), 0 to exit:");
            System.out.println("1.Java5 2.Java6 3.Java7 4.Java8 5.Java9 6.Java10 7.Java11 8.Java12 9.Java13 10.Java14 11.Java15 12.Java16 13.Java17 0.Exit");
            System.out.print("Enter choice: ");
            int c = sc.nextInt();
            if (c == 0) break;
            Runnable r = demos.get(c);
            if (r != null) r.run();
            else System.out.println("Invalid choice");
        }
        sc.close();
        System.out.println("Goodbye!");
    }
}
