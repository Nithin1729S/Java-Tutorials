package DataHiding;


class Cylinder
{
    private double radius;
    private double height;
    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public void setRadius(double r)
    {

        if(r>0) radius=r;
        else radius=0;
    }
    public void setHeight(double h)
    {

        if(h>0)height=h;
        else height=0;
    }

    public void setDimensions(double r,double h)
    {
        if(r>0 && h>0)
        {
            radius=r;
            height=h;
        }
        else {
            radius=0;
            height=0;
        }
    }
    public Cylinder()
    {
        radius=0;
        height=0;
    }

    public Cylinder(double r)
    {
        setRadius(r);
    }
    public Cylinder(double r,double h)
    {
        setRadius(r);
        setHeight(h);
    }


}
public class CylinderTest
{
    public static void main(String[] args) {

    }
}
