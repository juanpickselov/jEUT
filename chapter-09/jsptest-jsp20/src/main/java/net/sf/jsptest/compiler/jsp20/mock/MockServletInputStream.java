package net.sf.jsptest.compiler.jsp20.mock;

import javax.servlet.ServletInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Mock implementation of <code>ServletInputStream</code>.
 * 
 * @author Lasse Koskela
 */
public class MockServletInputStream extends ServletInputStream {

    private ByteArrayInputStream stream;

    public MockServletInputStream(byte[] data) {
        stream = new ByteArrayInputStream(data);
    }

    public int read() throws IOException {
        return stream.read();
    }
}
