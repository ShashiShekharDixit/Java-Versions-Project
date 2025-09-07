package versions;

public class Java13Features {
    public static void run() {
        System.out.println("=== Java 13 Features ===");
        // Text blocks preview - using modern syntax works on Java 15+; showing example string
        String html = """
            <html>
              <body>Text Block</body>
            </html>
            """;
        System.out.println(html);
    }
}
