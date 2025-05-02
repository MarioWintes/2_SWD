package loggerfactory;

public class DebugLogger implements LoggerInterface{

    public DebugLogger() {
    }

    @Override
    public void logStatus(String message) {
        System.out.println("Debug: " + message);
    }
}
