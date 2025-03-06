package ro.ulbs.paradigme.lab2.api;

public interface MyList {
    void addValue(int value);
    Node getNodeByValue(int value);
    void removeNodeByValue(int value);
    void listNodes();
    int sumValues();
    boolean isSorted();
}