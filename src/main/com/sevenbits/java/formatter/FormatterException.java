package main.com.sevenbits.java.formatter;


import main.com.sevenbits.java.reader.implement.ReadException;
import main.com.sevenbits.java.writter.WriteException;

/**
 * Created by 1 on 16.05.2016.
 */
public class FormatterException extends Throwable {

    FormatterException(final String string, final ReadException e) {
        super(string, e);
    }

    FormatterException(final String string, final WriteException e) {
        super(string, e);
    }
}
