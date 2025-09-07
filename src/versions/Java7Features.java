package versions;
import java.io.*;
import java.util.*;

public class Java7Features {
    public static void run() {
        System.out.println("=== Java 7 Features ===");
        // Diamond operator
        List<String> list = new ArrayList<>();
        list.add("alpha");
        System.out.println("List: " + list);

        // try-with-resources
        try (StringReader sr = new StringReader("hello")) {
            int c = sr.read();
            System.out.println("Read char code: " + c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Strings in switch
        String s = "hello";
        switch (s) {
            case "hello": System.out.println("greet"); break;
            default: System.out.println("default"); break;
        }

        // multi-catch example
        try {
            if (true) throw new IllegalArgumentException("bad"); 
        } catch (IllegalArgumentException | IllegalStateException ex) {
            System.out.println("Caught multi-catch: " + ex.getMessage());
        }
    }
}
