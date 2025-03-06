package ro.ulbs.paradigme.lab2;

public class Application {
    public static void main (String[] args){
        Triangle tri=new ro.ulbs.paradigme.lab2.Triangle(1.1F, 2.0F, "red";
        ro.ulbs.paradigme.lab2.Circle c=new Circle(1.5F, "yellow"):
        ro.ulbs.paradigme.lab2.Square sq=new ro.ulbs.paradigme.lab2.Square(1.2F, "blue");
    }

    {
        System.out.println("Area = "tri.getArea() + "details: " + tri);
        System.out.println("Area = "c.getArea() + "details: "_ + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        Triangle tri2 = new Triangle(1.1F, 2.0F, "red");
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));
        Triangle tri3 = new Triangle(1.1F, 2.0F, "brown");
        System.out.println("Triangle3 equals to Triangle1: " + tri.equals(tri3));
    }
}
