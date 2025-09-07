package versions;
import java.util.*;

public class Java9Features {
    public static void run() {
        System.out.println("=== Java 9 Features ===");
        List<String> fixed = List.of("a","b","c");
        System.out.println("List.of: " + fixed);

        InterfaceWithPrivate.m();
    }

    interface InterfaceWithPrivate {
        static void m() {
            System.out.println("static method"); helper();
        }
        private static void helper() { System.out.println("private helper in interface (Java 9)"); }
    }
}
