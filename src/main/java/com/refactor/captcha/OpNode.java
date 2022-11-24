package com.refactor.captcha;

public class OpNode implements Node {

    private Operator operator;

    private Node leftOperand;
    private Node rightOperand;

    public OpNode(Operator operator, Node leftOperand, Node rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public static Node valueNode(int value) {
        return new ValueNode(value);
    }

    public static Node opNode(Operator operator, Node leftOperand, int value) {
        return new OpNode(operator, leftOperand, valueNode(value));
    }

    @Override
    public Integer compute() {
        return this.operator.compute(leftOperand, rightOperand);
    }

    @Override
    public String display() {
        return this.operator.display(leftOperand, rightOperand);
    }
}
