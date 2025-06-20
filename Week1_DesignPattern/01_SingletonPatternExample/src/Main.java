public class Main {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.showMessage();

        if(logger1 == logger2) {
            System.out.println("Both are of same instance");
        } else {
            System.out.println("Both are of different instances");
        }

    }
}