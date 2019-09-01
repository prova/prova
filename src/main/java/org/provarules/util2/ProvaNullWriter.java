package org.provarules.util2;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public final class ProvaNullWriter extends Writer {

    private static final Writer INSTANCE = new ProvaNullWriter();

    public static final Writer getInstance() {
        return INSTANCE;
    }

    private static final PrintWriter PRINTWRITER_INSTANCE = new PrintWriter(new ProvaNullWriter());

    public static final PrintWriter getPrintWriter() {
        return PRINTWRITER_INSTANCE;
    }

    private ProvaNullWriter() {

    }

    public void close() throws IOException {

    }

    public void flush() throws IOException {

    }

    public void write(char[] cbuf, int off, int len) throws IOException {

    }
}