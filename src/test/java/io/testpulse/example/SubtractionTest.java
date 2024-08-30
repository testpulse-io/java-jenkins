package io.testpulse.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SubtractionTest {
    @Test
    void testSubtract() {
        Subtraction subtraction = new Subtraction();
        assertEquals(1, subtraction.subtract(3, 2));
        assertEquals(5, subtraction.subtract(2, -3));
        assertEquals(0, subtraction.subtract(0, 0));
    }
}
