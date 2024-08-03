package org.a2zsoftware.calculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PercentageTest {

    @Test
    void percentConstructor() {
        assertEquals(0.05, new Percentage(0.05).getValue());
        assertEquals(0.0251, new Percentage(0.0251).getValue());
    }

    @Test
    void percentToString() {
        Percentage percentage = new Percentage(0.051);
        assertEquals("5.1%", percentage.toString());
        Percentage percentage2 = new Percentage(0.0251);
        assertEquals("2.51%", percentage2.toString());
    }

    @Test
    void multiply() {
        Percentage percentage = new Percentage(0.05);
        assertEquals(new Percentage(0.1), percentage.multiply(2.0));
    }

    @Test
    void divide() {
        Percentage percentage = new Percentage(0.05);
        assertEquals(new Percentage(0.025), percentage.divide(2.0));
    }
}
