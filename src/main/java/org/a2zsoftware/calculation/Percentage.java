package org.a2zsoftware.calculation;

import java.beans.PersistenceDelegate;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;

public class Percentage {

    private final double value;

    public Percentage(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Percentage multiply(double operand) {
        return new Percentage(value * operand);
    }

    @Override
    public String toString() {
//        return (value * 100) + "%";
        return (new BigDecimal(value * 100.0)).round(MathContext.DECIMAL64).doubleValue() + "%";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Percentage) {
            return this.value == ((Percentage) obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) value;
    }

    public Percentage divide(double operand) {
        return new Percentage(value / operand);
    }


}
