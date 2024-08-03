package org.a2zsoftware.calculation;

public class Deductible {

    private final Percentage percentage;

    public Deductible(double percentage) {
        this(new Percentage(percentage));
    }

    public Deductible(Percentage percentage) {
        this.percentage = percentage;
    }

    public Money getDeductibleMoney(double coverage) {
        Money coverageAmount = new Money(coverage);
        return coverageAmount.multiply(percentage);
    }
}
