package Task_4;

import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes;

    // constructor
    public ShapeBuilder(){
        // initialize the list
        this.shapes = new ArrayList<>();

    }

    // method to add new shape objects
    public void addShape(Shape s){
        shapes.add(s);

    }

    // make method that returns the put together area of all the shape object fom the list
    public void getTotalArea(){
        for( Shape s: shapes){
            System.out.println("Area: " + s.getArea());
        }
    }
}
