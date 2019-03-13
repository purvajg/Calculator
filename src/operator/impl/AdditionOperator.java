package operator.impl;

public class AdditionOperator extends BinaryOperator {

    public AdditionOperator(Double first, Double second) {
        super(first, second);
    }


    @Override
    public Double operate() {
        return first + second;
    }
}
