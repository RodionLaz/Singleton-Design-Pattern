package singleton.design.pattern;

public class Class2 {
    private static Logger logger;
    public Class2(){
        logger = logger.getInstance();
    }
    public static void doSomething(){
        logger.logInfo("Something Done in class 2 + Counter : " + logger.getCounter());
    } 
}
