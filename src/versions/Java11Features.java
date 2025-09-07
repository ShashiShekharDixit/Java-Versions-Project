package versions;
import java.net.http.*;
import java.net.*;

public class Java11Features {
    public static void run() {
        System.out.println("=== Java 11 Features ===");
        var number = 10;
        System.out.println("var example: " + number);

        String txt = "  Hello\nWorld  ";
        System.out.println("isBlank: " + txt.isBlank());
        System.out.println("lines:");
        txt.lines().forEach(System.out::println);

        // HTTP client example (safe minimal request - may require network)
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest req = HttpRequest.newBuilder(URI.create("https://httpbin.org/get")).GET().build();
            HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println("HTTP status: " + resp.statusCode());
        } catch (Exception e) {
            System.out.println("HTTP client example skipped or failed: " + e.getMessage());
        }
    }
}
