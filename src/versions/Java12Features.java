package versions;

public class Java12Features {
    public static void run() {
        System.out.println("=== Java 12 Features ===");
        // Switch expressions (preview/evolving) example using new form (works in modern compilers)
        String day = "MON";
        String type = switch(day) {
            case "SAT", "SUN" -> "WEEKEND";
            default -> "WEEKDAY";
        };
        System.out.println("Switch expression result: " + type);
    }
}
