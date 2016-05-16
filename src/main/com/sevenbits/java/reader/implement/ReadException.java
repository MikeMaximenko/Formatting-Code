package main.com.sevenbits.java.reader.implement;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 1 on 16.05.2016.
 */
public class ReadException extends Exception {
    /**
     * @param string of string.
     * @param e exception.
     */
    ReadException(final String string, final FileNotFoundException e) {
        super(string, e);
    }
    /**
     * @param string of string.
     * @param e exception.
     */
    ReadException(final String string, final IOException e) {
        super(string, e);
    }
}
