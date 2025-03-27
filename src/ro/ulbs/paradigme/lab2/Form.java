package ro.ulbs.paradigme.lab2;

public class Form {
    private static int instanceCount = 0;

    private String color;
    private int instanceNumber;

    public Form() {
        color = "white";
        instanceCount++;
        instanceNumber = instanceCount;
    }

    public Form(String color) {
        this.color = color;
        instanceCount++;
        instanceNumber = instanceCount;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public float getArea() {
        return 0;
    }

    public String toString() {
        return "This form has the color " + color + " instance number " + instanceNumber;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Form) {
            Form f = (Form) obj;
            if (this.color == null && f.color == null) {
                return true;
            } else if (this.color != null && f.color != null && this.color.compareTo(f.color) == 0) {
                return true;
            }
        }
        return false;
    }
}
