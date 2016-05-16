package main.com.sevenbits.java.main;

import main.com.sevenbits.java.reader.*;
import main.com.sevenbits.java.formatter.*;
import main.com.sevenbits.java.reader.implement.ReadException;
import main.com.sevenbits.java.reader.implement.ReadFile;
import main.com.sevenbits.java.reader.implement.ReadString;
import main.com.sevenbits.java.writter.*;


/**
 * Created by 1 on 12.05.2016.
 */
public final class MainFunc {

    /**
     * Constructor.
     */
    private MainFunc() {
    }

    /**
     * Main function.
     * @param arg of String.
     * @throws MainException exception.
     */
    public static void main(final String[] arg) throws MainException {

        try {
            IRead readFile = new ReadFile("src\\main\\com\\sevenbits\\java\\exampleFile\\in.txt");
            IWrite writeFile = new Write("src\\main\\com\\sevenbits\\java\\exampleFile\\out.txt");
            IFormatter formatter = new Formatter();

            formatter.formatter(readFile, writeFile);

            StringBuilder readText = new StringBuilder("\n\nWhile (r<100) {r=0;r++;r+=r;While (r<100) {r=0;r++;r+=r;}}");
            IRead text = new ReadString(readText);
            formatter.formatter(text, writeFile);

            readFile.close();
            writeFile.close();

        } catch (ReadException | WriteException | FormatterException e) {
            throw new MainException("Fail compilation in main function", e);
        }

    }
}


