public class Main {
    public static void main(String[] args)
    {
        Logger logger = new Logger();

        logger.log(logLevel.info, "This is info logLevel");
        logger.log(logLevel.debug, "This is debug logLevel");
        logger.log(logLevel.warn, "This is warn logLevel");
        logger.log(logLevel.error, "This is error logLevel");
    }
}
