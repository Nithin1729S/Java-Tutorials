package Conditional;
import java.util.Scanner;
public class Switch
{
    public static void main(String[] args)
    {
        int a;
        int b;
        System.out.println("Menu\n1.Add\n2.Sub\n3.Mul\n4.Div");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();
        String choice;
        System.out.println("Enter the option:");
        choice=sc.nextLine();
        switch (choice)
        {
            case"Add": System.out.println(a+b);break;
            case"Sub": System.out.println(a-b);break;
            case"Mul": System.out.println(a*b);break;
            case"Div":System.out.println(a/b);break;

        }

    }
}
