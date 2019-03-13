package operator.impl;

public class DivisionOperator extends BinaryOperator{
    DivisionOperator(Double first, Double second) {
        super(first, second);
    }

    @Override
    public Double operate() {
        if(second == null || second == 0.0) return 0.0;
        return first/second;
    }
}
