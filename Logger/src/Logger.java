
enum logLevel
{
    info, debug, warn, error
};

public class Logger {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";

    void log(logLevel level, String message)
    {
        String color = ANSI_WHITE;

        switch (level)
        {
            case info: color = ANSI_WHITE;
            break;
            case debug: color = ANSI_GREEN;
            break;
            case warn: color = ANSI_YELLOW;
            break;
            case error: color = ANSI_RED;
            break;
            default: break;
        }

        System.out.println(color + message + ANSI_RESET);

    }
}
