package Loops;
import java.util.Scanner;
public class intro
{
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number whose multiplication table to be found out: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}
