package org.a2zsoftware.calculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void testToString() {
        Money money = new Money(50);
        assertEquals("$50.00", money.toString());
    }

    @Test
    void testToStringDecimalPlaces() {
        Money money = new Money(50.1);
        assertEquals("$50.10", money.toString());
    }
}