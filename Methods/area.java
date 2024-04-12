package Methods;

import java.net.SocketOption;

public class area
{
    static float area(float a,float b)
    {
        return a*b;
    }
    static float area(float r)
    {
        return (float)(Math.PI)*r*r;
    }

    public static void main(String[] args) {

        System.out.println(area(3,6));
        System.out.println(area(3));
    }

}
