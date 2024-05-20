package singleton.design.pattern;


public class Class1 {

    private static Logger logger;
    public Class1(){
        logger = logger.getInstance();
    }
    public static void doSomething(){
        logger.logInfo("Something Done in class 1 Counter : " + logger.getCounter());
    } 
}
