package Task_4;

public class Circle implements Shape{
    final private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
