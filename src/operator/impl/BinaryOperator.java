package operator.impl;

import operator.Operable;

public abstract class BinaryOperator implements Operable {
    protected Double first, second;

    BinaryOperator(Double first, Double second) {
        this.first  = first;
        this.second = second;
    }

    protected void displayMessage() {
        System.out.println("You are about to perform a binary operation");
    }
}
