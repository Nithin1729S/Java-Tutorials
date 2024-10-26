package DataHiding;

class Rectangle {
    private double lenght;
    private double breadth;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double l)
    {
        if(l>0) lenght=l;
        else l=0;
    }

    public double getBreadth()
    {
        return breadth;
    }

    public void setBreadth(double b)
    {
        if(b>0) breadth=b;
        else b=0;
    }

    public double area()
    {
        return lenght*breadth;
    }
    public double perimeter()
    {
        return 2*(lenght+breadth);
    }


}
public class RectangleTest
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setBreadth(50.6);
        r.setLenght(89.0);
        System.out.println(r.area());
        System.out.println(r.getBreadth());
    }
}
