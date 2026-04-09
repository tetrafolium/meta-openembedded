package oata;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static int triggerForwardedNullDerefFromManifest() {
        String value = CoverityNullDeref.runCrossRepoNullDerefScenario();
        return triggerForwardedNullDeref(value);
    }

    public static int triggerForwardedNullDeref(String value) {
        CrossRepoSink.consume(value);
        return 0;
    }
}
