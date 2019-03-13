package operator.impl;

public class SubtractionOperator extends BinaryOperator {

    public SubtractionOperator(Double first, Double second) {
        super(first, second);
    }

    @Override
    public Double operate() {
        return Math.max(first, second) - Math.min(first, second);
    }
}
