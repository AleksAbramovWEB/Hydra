package onion.hydra;

public abstract class AbstractHydra extends Thread {

    protected static String ALIAS = "hydra";

    /** восстановить ранее прерванную сессию Hydra; */
    protected static String SESSION = "-R";

    /** использовать SSL для подключения; */
    protected static String SSL = "-S";

    /** указать порт; */
    protected static String PORT = "-s";

    /** выбирать логины из файла со списком; */
    protected static String LOGINS = "-L";

    /** использовать пароль из файла со списком; */
    protected static String PASSWORDS = "-P";

    /** использовать пароль из файла со списком; */
    protected static String EXIT = "-f";

    @Override
    public void run() {
        super.run();
    }
}
