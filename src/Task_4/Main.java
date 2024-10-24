package Task_4;

public class Main {
    public static  void main(String[]args){
        // making the objects by initiating objects
        Circle c1 = new Circle(5.2);
        Square sq1 = new Square(4,5);

        // printing the area of c1 and sq1
        System.out.println("Area: " + c1.getArea());
        System.out.println("Area: " + sq1.getArea());

        // making the object shapeBuilder  and adding the shapes to the list
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(sq1);

       // \n move to next line
        System.out.println("\nAll areas in shapeBuilder: ");
        shapeBuilder.getTotalArea();
    }
}
