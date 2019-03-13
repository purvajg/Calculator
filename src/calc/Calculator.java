package calc;

import operator.impl.AdditionOperator;
import operator.impl.BinaryOperator;
import operator.impl.SubtractionOperator;

import java.util.Scanner;

public class Calculator {

    public static void main(String [] args){
        BinaryOperator operator;
        Scanner in = new Scanner(System.in);
        double a = 50;
        double b = 100;
        while(in.hasNext()) {
            char c = in.next().charAt(0);
            switch (c) {
                case '+' : operator = new AdditionOperator(a,b); break;
                case '-' : operator = new SubtractionOperator(a,b); break;
                default: throw new IllegalArgumentException("Operator not supported yet");
            }
            System.out.println(operator.operate());
        }

    }

}
