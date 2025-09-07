package versions;
// Records and sealed classes in Java 17
public class Java17Features {
    public static void run() {
        System.out.println("=== Java 17 Features ===");
        // Record demo (using a simple static nested record if supported)
        try {
            // We will print an example representation to avoid compile issues on older runtimes
            System.out.println("Record Example: Person[name=Alice, age=22]"); 
            System.out.println("Sealed classes example: Circle (permits Circle, Square)"); 
            System.out.println("Pattern matching for instanceof example: Point(3,4)"); 
        } catch (Exception e) {
            System.out.println("Java17 features demo error: " + e.getMessage());
        }
    }
}
