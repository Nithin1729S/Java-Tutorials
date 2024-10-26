package DataHiding;

class Rect
{
    private double  length;
    private double breadth;
    public Rect()
    {
        length=1;
        breadth=1;
        System.out.println("No Args Constructor called");
    }

    public Rect(double l, double b)
    {
        length=l;
        breadth=b;
        System.out.println("2 Args Constructor called");
    }
    public Rect(double s)
    {
        length=breadth=s;
        System.out.println("1 Args Constructor called");
    }

}
public class Constructor
{
    public static void main(String[] args) {
        Rect r= new Rect(13,8);

    }

}
