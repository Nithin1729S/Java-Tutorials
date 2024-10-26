package Loops;

import java.util.Scanner;

public class sum
{
    public static void main(String[] args) {
        int num;
        int sum=0;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of "+num+" numbers is "+sum);




    }
}
