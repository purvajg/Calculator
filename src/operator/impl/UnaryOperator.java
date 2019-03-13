package operator.impl;

import operator.Operable;

public abstract class UnaryOperator implements Operable {
    protected Double first;

    UnaryOperator(Double first) {
        this.first = first;
    }
}
