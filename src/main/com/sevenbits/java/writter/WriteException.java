package main.com.sevenbits.java.writter;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 1 on 16.05.2016.
 */
public class WriteException extends Exception {
    /**
     * @param string of string.
     * @param e exception.
     */
    WriteException(final String string, final IOException e) {
        super(string, e);
    }

    /**
     * @param string of string.
     * @param e exception.
     */
    WriteException(final  String string, final FileNotFoundException e) {
        super(string, e);
    }

}
