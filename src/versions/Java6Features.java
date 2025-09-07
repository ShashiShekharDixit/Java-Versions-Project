package versions;
import javax.script.*;

public class Java6Features {
    public static void run() {
        System.out.println("=== Java 6 Features ===");
        System.out.println("Scripting (JavaScript) via ScriptEngine if available:");

        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("javascript");
            if (engine != null) {
                Object result = engine.eval("1+2"); // may be supported depending on JDK
                System.out.println("Script result: " + result);
            } else {
                System.out.println("No JS engine available in this JDK runtime.");
            }
        } catch (Exception e) {
            System.out.println("Scripting unavailable: " + e.getMessage());
        }
    }
}
