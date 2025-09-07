package versions;
import java.util.*;

public class Java10Features {
    public static void run() {
        System.out.println("=== Java 10 Features ===");
        var list = List.of("one","two","three"); // local type inference
        for (var s : list) System.out.println(s);
    }
}
