package org.factoriaf5.infiltration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        App.main(new String[] {});
        System.setOut(originalOut);
        String expectedOutput = """
                Annalyn's Infiltration Test Cases:
                canFastAttack: true
                canSpy: true
                canSignalPrisoner: false
                canFreePrisoner: false
                """;
                assertEquals(expectedOutput.replace("\r\n", "\n"), outputStream.toString().replace("\r\n", "\n"));
    }
}
