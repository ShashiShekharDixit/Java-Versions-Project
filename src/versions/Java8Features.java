package versions;
import java.util.*;
import java.util.stream.*;

interface MyInterface {
    default void show() { System.out.println("Default method in Interface"); }
}

public class Java8Features implements MyInterface {
    public static void run() {
        System.out.println("=== Java 8 Features ===");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        // Lambda
        numbers.forEach(n -> System.out.println("Lambda square: " + n*n));
        // Streams
        List<Integer> evens = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println("Evens: " + evens);
        // Default method
        new Java8Features().show();
    }
}
