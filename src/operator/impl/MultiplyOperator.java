package operator.impl;

public class MultiplyOperator extends BinaryOperator{

    MultiplyOperator(Double first, Double second) {
        super(first, second);
    }

    @Override
    public Double operate() {
        return first*second;
    }
}
