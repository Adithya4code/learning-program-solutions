public class Logger {

    private Logger() {
        System.out.println("Singleton Instance Created");
    }

    public class loggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return loggerHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from Logger");
    }
}
