package org.a2zsoftware.calculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeductibleTest {

    @Test
    void getDeductibleMoney() {
        Deductible deductible = new Deductible(0.02);
        Money deductibleDollars = deductible.getDeductibleMoney(300000);
        assertEquals(6000, deductibleDollars.doubleValue());
    }
}