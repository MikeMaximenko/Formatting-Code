package main.com.sevenbits.java.formatter;

import main.com.sevenbits.java.reader.IRead;
import main.com.sevenbits.java.reader.implement.ReadException;
import main.com.sevenbits.java.writter.IWrite;
import main.com.sevenbits.java.writter.WriteException;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by 1 on 13.05.2016.
 */
public class Formatter implements IFormatter {


    /**
     * A rough cycle formatting text.
     *
     * @param read  read file or string.
     * @param write write file.
     * @throws FormatterException of exception.
     */
    public final void formatter(final IRead read, final IWrite write) throws FormatterException {

        Map<Character, String> keys = new HashMap<>();
        keys.put('{', "{\n");
        keys.put(';', ";\n");
        keys.put('}', "}");



        char t1; // N symbol.
        char t2; // N+1 symbol.
        int indent = 0;

        try {
            t2 = read.get();

            while (read.endFile()) {
                t1 = t2;            //t1 first element, t2 second element.
                t2 = read.get();


                if (keys.containsKey(t1)) {

                    if (t1 == ';' & t2 == '}') {    //Specific combinations. ';' + '}'.
                        write.set(keys.get(t1));
                        indent--;
                        for (int i = 0; i < indent; i++) {
                            write.set("    ");
                        }
                        write.set(keys.get(t2));


                    } else if (t1 == '{') {
                        indent++;
                        write.set(keys.get(t1));
                        for (int i = 0; i < indent; i++) {
                            write.set("    ");
                        }

                    } else if (t1 == '}') {
                        indent--;
                        write.set("\n");
                        for (int i = 0; i < indent; i++) {
                            write.set("    ");
                        }
                        write.set(keys.get(t1));


                    } else {
                        write.set(keys.get(t1));      //Indent.
                        for (int i = 0; i < indent; i++) {
                            write.set("    ");
                        }
                    }
                } else write.set(String.valueOf(t1));

            }




        } catch (ReadException e) {
            throw new FormatterException("Fail in formatting class with reading text", e);
        } catch (WriteException e) {
            throw new FormatterException("Fail in formatting class with writing text", e);
        }
    }

}



