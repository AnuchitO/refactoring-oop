package com.refactor.captcha;

public abstract class Operator {
    private final String symbol;

    public Operator(String symbol) {
        this.symbol = symbol;
    }

    public static Operator minus() {
        return new Minus();
    }

    public static Operator plus() {
        return new Plus();
    }

    public static Operator multiply() {
        return new Multiply();
    }

    public String getSymbol() {
        return symbol;
    }


    public String display(Node left, Node right) {
        return left.display() + " " + this.symbol + " " + right.display();
    }

    public abstract Integer compute(Node left, Node right);

}
