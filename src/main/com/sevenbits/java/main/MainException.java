package main.com.sevenbits.java.main;

/**
 * Created by 1 on 16.05.2016.
 */
class MainException extends Throwable {

    /**
     * Exception in main class.
     * @param string of string.
     * @param e of exception.
     */
    MainException(final String string, final Throwable e) {
        super(string, e);
    }
}
