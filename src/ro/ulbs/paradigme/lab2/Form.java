package ro.ulbs.paradigme.lab2;

// Clasa de baza Form
public class Form {
    private String color;

    public Form() {
        this.color = "white";
    }

    public Form(String color) {
        this.color = color;
    }

    public static String getCounter() {
        
    }

    public float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "This form has the color " + color;
    }
}
