package org.a2zsoftware.calculation;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Money {

    private static NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();

    private BigDecimal amount;

    public Money(double value) {
        this.amount = new BigDecimal(value);
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return moneyFormat.format(amount);
    }

    public Money multiply(Percentage percentage) {
        return new Money(amount.multiply(new BigDecimal(percentage.getValue())));
    }

    public double doubleValue() {
        return amount.doubleValue();
    }
}
