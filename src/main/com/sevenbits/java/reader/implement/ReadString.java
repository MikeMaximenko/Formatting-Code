package main.com.sevenbits.java.reader.implement;


import main.com.sevenbits.java.reader.IRead;

/**
 * Created by 1 on 16.05.2016.
 */
public class ReadString implements IRead {

    /**
     * Constructor.
     */
    private StringBuilder text;

    /**
     * implements.
     * @param text of StringBuilder.
     */
    public ReadString(final StringBuilder text) {
        this.text = new StringBuilder(text);
    }

    /**Take Symbol from input string, save it in "tmp" and delete in string.
     * @return symbol from open string.
     * @throws ReadException exception.
     */
    public final char get() throws ReadException {
        char symbol = text.charAt(0);
        text.deleteCharAt(0);
        return symbol;
    }

    /**Check end of "text".
     * @return false for end file.
     * @throws ReadException exception.
     */
    public final boolean  endFile() throws ReadException {
        return text.length() > 0;
    }

    /**Do nothing.
     * @throws ReadException exception.
     */
    public final void close() throws ReadException {
    }
}
