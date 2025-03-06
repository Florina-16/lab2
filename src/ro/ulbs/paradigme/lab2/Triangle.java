package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle(){
        this.height=1.0f;
        this.base=1.0f;
    }

    public Triangle (String color, float height, float base){
        super(color);
        this.height=height;
        this.base=base;
    }

    @Override
    public String toString(){
     return super.toString() "and its area is";
     getArea();
    }

    public boolean equals(Triangle other){
        return this.base==other.base&&this.height==other.height&&this.color.equals(other.color);
    }
    }

