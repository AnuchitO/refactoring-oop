package com.refactor.captcha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NodeTest {

    @Test
    public void display_ValueNode_printsTheValue() {
        Node valueNode = OpNode.valueNode(1);
        assertEquals("1", valueNode.display());
    }

    @Test
    public void display_OperatorNode_printsTheEquation() {
        Node operatorNode = OpNode.opNode(Operator.plus(), OpNode.valueNode(1), 2);
        assertEquals("1 + 2", operatorNode.display());
    }

    @Test
    public void display_complexOperatorNodes() {
        Node f = OpNode.opNode(Operator.multiply(), OpNode.valueNode(2), 5);
        Node g = OpNode.opNode(Operator.plus(), f, 3);

        assertEquals("2 * 5 + 3", g.display());
    }

    @Test
    public void compute_ValueNode_givesTheValueBack() {
        Node valueNode = OpNode.valueNode(2);
        assertEquals(2, valueNode.compute().intValue());
    }

    @Test
    public void compute_OperatorNode_givesTheComputedResult() {
        Node opsNode = OpNode.opNode(Operator.minus(), OpNode.valueNode(5), 3);
        assertEquals(2, opsNode.compute().intValue());
    }

    @Test
    public void compute_complexOperatorNodes() {
        Node f = OpNode.opNode(Operator.multiply(), OpNode.valueNode(2), 5);
        Node g = OpNode.opNode(Operator.plus(), f, 3);

        assertEquals(13, g.compute().intValue());
    }

}
