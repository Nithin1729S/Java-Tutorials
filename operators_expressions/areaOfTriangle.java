import java.lang.*;
import java.util.Scanner;
class areaOfTriangle
{
    public static void main(String[] args)
    {
        float base,height,area;
        System.out.println(("Enter Base and Height: "));

        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();

        area=1f/2f*base*height;
        System.out.println("Area of the triangle is " +area);

        
    }
}