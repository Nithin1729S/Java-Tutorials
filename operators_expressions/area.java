package operators_expressions;

import java.util.Scanner;

class area
{
    public static void main(String[] args)
    {
        int a,b,c;
        float s,are;

        System.out.print("Enter the three sides of the triangle: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s=(a+b+c)/2f;
        are=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("The area of the triangle is "+are);
    }
}