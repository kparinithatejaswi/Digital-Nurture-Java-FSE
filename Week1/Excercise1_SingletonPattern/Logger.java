package Week1.Excercise1_SingletonPattern;
public class Logger {
    private static Logger instance = new Logger();

    private Logger()
    {
        System.out.println("Logger Object Created");
    }

    public static Logger getInstance()
    {
        return instance;
    }

    public void log(String message)
    {
        System.out.println("LOG MESSAGE : " + message);
    }

}
    

