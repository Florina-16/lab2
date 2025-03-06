package ro.ulbs.paradigme.lab2;

import ro.ulbs.paradigme.lab2.api.Node;
import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;

public class Application_ {
    public static void main(String[] args) {
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }
        simpleList.listNodes();

        DoubleChainedList doubleList = new DoubleChainedList() {
            @Override
            public Node getNodeByValue(int value) {
                return null;
            }

            @Override
            public void removeNodeByValue(int value) {

            }
        };
        for (int i = 1; i <= 10; i++) {
            doubleList.addValue(i);
        }
        doubleList.listNodes();
    }
}
