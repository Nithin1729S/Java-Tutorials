package Methods;

import java.util.Scanner;

public class Primes
{

    static boolean isPrime(int a)
    {
        for(int i=2;i<a;i++)
        {
            if(a%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        if(isPrime(num)) System.out.println("Its a Prime Number");
        else System.out.println("Its not a prime number");


    }
}
