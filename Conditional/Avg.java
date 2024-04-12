package Conditional;
import java.util.Scanner;
public class Avg
{
    public static void main(String[] args) {
        int m1,m2,m3;
        System.out.println("Enter marks of three subjects");
        Scanner sc=new Scanner(System.in);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg=(m1+m2+m3)/3;
        if(avg>70)
        {
            System.out.println("Grade A");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("Grade B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("Grade C");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
