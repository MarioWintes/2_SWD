package loggerfactory;

public class InfoLogger implements LoggerInterface{

    public InfoLogger() {
    }

    @Override
    public void logStatus(String message) {
        System.out.println("Info: " + message);

    }
}
