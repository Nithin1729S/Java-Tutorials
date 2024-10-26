package Abstract;

import java.awt.image.CropImageFilter;

abstract class Shape
{
    abstract public void perimeter();
    abstract public void area();
}

class Circle extends Shape
{
    float radius;
    Circle(float radius)
    {
        this.radius=radius;
    }
    public void perimeter()
    {
        System.out.println("Perimeter: "+2*Math.PI*radius);
    }
    public void area()
    {
        System.out.println("Area: "+Math.PI*radius*radius);
    }
}

class Rectangle extends Shape
{
    public float length;
    public float breadth;
    Rectangle(float length,float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void perimeter()
    {
        System.out.println("Perimiter: "+2*(length+breadth));
    }
    public void area()
    {
        System.out.println("Area: "+length*breadth);
    }
}
public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,11);
        r.area();
        Circle c=new Circle(22);
        c.perimeter();
    }
}
