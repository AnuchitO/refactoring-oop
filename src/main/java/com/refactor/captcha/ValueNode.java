package com.refactor.captcha;

public class ValueNode implements Node {
    protected Integer value = 0;

    public ValueNode(Integer value) {
        this.value = value;
    }

    @Override
    public Integer compute() {
        return this.value;
    }

    @Override
    public String display() {
        return this.value.toString();
    }
}
