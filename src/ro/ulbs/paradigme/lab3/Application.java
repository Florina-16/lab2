package ro.ulbs.paradigme.lab3;

import ro.ulbs.paradigme.lab2.Form;

public class Application {
    public static void main(String[] args) {
        Form f1 = new Form();
        Form f2 = new Form("red");
        Form f3 = new Form("blue");

        System.out.println("Total Forms created: " + Form.getCounter());
    }
}
