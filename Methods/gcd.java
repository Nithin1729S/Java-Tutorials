package Methods;

import java.util.Scanner;

public class gcd
{
    static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);

    }

    public static void main(String[] args) {
        System.out.println("Enter two number: ");
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        num1=sc.nextInt();
        num2=sc.nextInt();

        System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd(num1,num2));

    }
}

