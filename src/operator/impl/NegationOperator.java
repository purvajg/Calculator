package operator.impl;

public class NegationOperator extends UnaryOperator {
    NegationOperator(Double first) {
        super(first);
    }

    @Override
    public Double operate() {
        return (-1.0) * first;
    }
}
