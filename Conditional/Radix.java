package Conditional;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class Radix
{
    public static void main(String[] args)
    {
        String num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("Binary Radix");
        }
        else if(num.matches("[0-7]+"))
            {
                System.out.println("Octal Radix");
            }
        else if(num.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix");
        }
        else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("Hexadecimal Radix");
        }
        else
        {
            System.out.println("Invalid Number");
        }





    }
}
