package singleton.design.pattern;



public class Logger {
    private static Logger instanceLogger;
    private int counter;

    private Logger() {
        counter = 0;
    }

    public int getCounter() {
        return this.counter;
    }

    public void logInfo(String msg) {
        counter++;
        System.out.println("INFO : " + msg);
    }

    public void logDebug(String msg) {
        counter++;
        System.out.println("DEBUG : " + msg);
    }

    public void logError(String msg) {
        counter++;
        System.out.println("ERROR : " + msg);
    }

    public static Logger getInstance() {
        if (instanceLogger == null) {
            synchronized (Logger.class) {
                if (instanceLogger == null) {
                    instanceLogger = new Logger();
                }
            }
        }
        return instanceLogger;
    }
}
