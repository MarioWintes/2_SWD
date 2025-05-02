package loggerfactory;

import java.util.logging.Logger;

public class LoggerFactory {

    private static final DebugLogger dl = new DebugLogger();
    private static final InfoLogger il = new InfoLogger();
    private static final Logger logger = Logger.getLogger(LoggerFactory.class.getName());



    public static Logger getLogger(ELogLevel logLevel){
        Logger LOGGER = Logger.getLogger("L");
        return LOGGER;
    }
}
