package main.com.sevenbits.java.writter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 1 on 12.05.2016.
 */
public class Write implements IWrite {

    /**
     * Constructor.
     */
    private FileOutputStream file;

    /**
     * Implements.
     * @param fileName file.
     * @throws WriteException exception.
     */
    public Write(final String fileName) throws WriteException {
        try {
            file = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new WriteException("Can't open write-file", e);
        }
    }

    /**
     * Set one char to file.
     * @param tmp of string.
     * @throws WriteException exception.
     */
    public final void set(final String tmp) throws WriteException {
        try {
            file.write(tmp.getBytes());
        } catch (IOException e) {
            throw new WriteException("Fail with setting char in write-file", e);
        }
    }

    /**
     * Close file.
     * @throws WriteException exception.
     */
    public final void close() throws WriteException {
        try {
            file.close();
        } catch (IOException e) {
            throw new WriteException("Can't close write-file", e);
        }
    }
}
