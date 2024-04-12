import java.util.*;

class Shape{
    String color;
    public void area()
    {
        System.out.println("Displays Area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h)
    {
        System.out.println(l*h);
    }
}

class EquivilateralTriangle extends Triangle{
    public void area(int l,int h)
    {
        System.out.println(l*h);
    }
}

class Circle extends Shape
{
    public void area(int r)
    {
        System.out.println("area of circle");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.color="blue";
    }
}
