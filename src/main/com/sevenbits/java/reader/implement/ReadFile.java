package main.com.sevenbits.java.reader.implement;

import main.com.sevenbits.java.reader.IRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 1 on 12.05.2016.
 */
public class ReadFile implements IRead {

    /**
     * Constructor.
     */
    private FileInputStream file;

    /**Implements.
     * @param file file.
     * @throws ReadException exception.
     */
    public ReadFile(final String file) throws ReadException {
        try {
            this.file = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new ReadException("File not find", e);
        }
    }

    /**Getter.
     * @return open the char file.
     * @throws ReadException exception.
     */
    public final char get() throws ReadException {
        try {
            return (char) file.read();
        } catch (IOException e) {
            throw new ReadException("Can't read file", e);
        }
    }

    /**Check end of file.
     * @return false for end file.
     * @throws ReadException exception.
     */
    public final boolean  endFile() throws ReadException {
        try {
            return file.available() != 0;
        } catch (IOException e) {
            throw new ReadException("Fail with end file?", e);
        }
    }

    /**Close file.
     * @throws ReadException exception.
     */
    public final void close() throws ReadException {
        try {
            file.close();
        } catch (IOException e) {
            throw new ReadException("Fail with closing file", e);
        }
    }
}
