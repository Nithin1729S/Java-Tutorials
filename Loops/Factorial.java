package Loops;

public class Factorial
{
    public static void main(String[] args) {
        int num=5;
        int res=1;
        for(int i=1;i<=num;i++)
        {
            res*=i;
        }
        System.out.println("The factorial of "+num+" is "+res);
    }
}
