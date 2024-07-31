public class SingletonTest {

        public static void main(String[] args) {
            Logger logger1 = Logger.getInstance();
            Logger logger2 = Logger.getInstance();

            logger1.log("Logging with logger1");
            logger2.log("Logging with logger2");

            // Verify both references point to the same instance
            System.out.println(logger1 == logger2);
        }
    }

