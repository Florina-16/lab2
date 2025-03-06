package ro.ulbs.paradigme.lab2;

public class Square extends ro.ulbs.paradigme.lab2.Form {
    private flost side;

    public Swuare(){
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
