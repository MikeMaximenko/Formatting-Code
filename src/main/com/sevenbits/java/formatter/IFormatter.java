package main.com.sevenbits.java.formatter;

import main.com.sevenbits.java.reader.IRead;
import main.com.sevenbits.java.writter.IWrite;

/**
 * Created by 1 on 12.05.2016.
 */
public interface IFormatter {

    /**
     * Implementation of the method of reforming the text.
     * @param read read file.
     * @param write write file.
     * @throws FormatterException of exception.
     */
    void formatter(final IRead read, final IWrite write) throws FormatterException;

}
