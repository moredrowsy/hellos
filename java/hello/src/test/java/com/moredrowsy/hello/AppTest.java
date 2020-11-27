package com.moredrowsy.hello;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Say "Hello, World!" with no arguments
     */
    @Test
    public void mainShouldSayHelloWorld() {
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        String[] args = {};
        App.main(args);

        final String standardOutput = myOut.toString();

        assertEquals(new String("Hello, World!\n"), standardOutput);
    }

    /**
     * Say "Hello, Your Name!" with arguments "your name"
     */
    @Test
    public void mainShouldSayYourName() {
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        String[] args = {"your", "name"};
        App.main(args);

        final String standardOutput = myOut.toString();

        assertEquals(new String("Hello, Your Name!\n"), standardOutput);
    }
}
