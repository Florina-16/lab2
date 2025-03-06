package ro.ulbs.paradigme.lab2;

public class Square extends Form {
    private float side;

    public Square(){
        super();
        this.side=1.0f;
    }

    public Square(String color, float side){
        super(color);
        this.side=side;
    }

    @Override
    public float getArea(){
        return side*side;
    }

    @Override
    public String toString(){
        return super.toString() "and its area is" getArea();
    }
}
