package io.testpulse.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AdditionTest {
    @Test
    void testAdd() {
        Addition addition = new Addition();
        assertEquals(5, addition.add(2, 3));
        assertEquals(-1, addition.add(2, -3));
        assertEquals(0, addition.add(0, 0));
    }
}
