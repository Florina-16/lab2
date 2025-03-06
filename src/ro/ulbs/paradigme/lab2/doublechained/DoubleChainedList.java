package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.MyList;
import ro.ulbs.paradigme.lab2.api.Node;

public abstract class DoubleChainedList implements MyList {
    private DoubleChainedNode head;

    @Override
    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            DoubleChainedNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setPrev(temp);
        }
    }

    @Override
    public void listNodes() {
        DoubleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    @Override
    public boolean isSorted() {
        if (head == null) return true;
        DoubleChainedNode temp = head;
        while (temp.getNext() != null) {
            if (temp.getValue() > temp.getNext().getValue()) {
                return false;
            }
            temp = temp.getNext();
        }
        return true;
    }

    @Override
    public int sumValues() {
        int sum = 0;
        DoubleChainedNode temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNext();
        }
        return sum;
    }
}
