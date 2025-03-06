package ro.ulbs.paradigme.lab2;

public class Circle extends Form {
    private float radius;

    public Circle(){
        super();
        this.radius=1.0f;
    }

    public Circle(String color, float radius){
        super(color);
        this.radius=radius;
    }

    @Override
    public float getArea(){

        return(float)(Math.PI*radius*radius);
    }

    @Override
    public String toString(){
        return super.toString() "and its are is" getArea();
    }
}
