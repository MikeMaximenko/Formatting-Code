package main.com.sevenbits.java.reader;


import main.com.sevenbits.java.reader.implement.ReadException;

/**
 * Created by 1 on 12.05.2016.
 */
public interface IRead {

    /**Getter.
     * @return open the char file.
     * @throws ReadException exception.
     */
    char get() throws ReadException;

    /**Check end of file.
     * @return false for end file.
     * @throws ReadException exception.
     */
    boolean endFile() throws ReadException;

    /**Close file.
     * @throws ReadException exception.
     */
    void close() throws ReadException;

}
