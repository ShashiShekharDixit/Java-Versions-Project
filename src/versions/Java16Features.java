package versions;

public class Java16Features {
    public static void run() {
        System.out.println("=== Java 16 Features ===");
        // Records final in Java 16 - show simple record if supported
        try {
            // If records are supported by compiler/runtime, use them in other file; here we just demo message.
            System.out.println("Records finalized in Java 16 (use a modern compiler to compile records)"); 
        } catch (Exception e) {
            System.out.println("Records demo skipped: " + e.getMessage());
        }
    }
}
