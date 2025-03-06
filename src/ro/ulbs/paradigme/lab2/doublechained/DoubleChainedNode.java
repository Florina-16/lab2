package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.Node;

public class DoubleChainedNode implements Node {
    private int value;
    private DoubleChainedNode next;
    private DoubleChainedNode prev;

    public DoubleChainedNode(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public DoubleChainedNode getNext() {
        return next;
    }

    public void setNext(DoubleChainedNode next) {
        this.next = next;
    }

    public DoubleChainedNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleChainedNode prev) {
        this.prev = prev;
    }
}
