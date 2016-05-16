package main.com.sevenbits.java.writter;


/**
 * Created by 1 on 12.05.2016.
 */
public interface IWrite {

    /**
     * Set one char to file or input string.
     * @param tmp of string.
     * @throws WriteException exception.
     */
    void set(final String tmp) throws WriteException;

    /**
     * Close file.
     * @throws WriteException exception.
     */
    void close() throws WriteException;
}
