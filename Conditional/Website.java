package Conditional;
import java.awt.*;
import java.util.Scanner;
public class Website
{
    public static void main(String[] args)
    {
            String web;
            Scanner sc=new Scanner(System.in);
            web=sc.nextLine();
            String protocol=web.substring(0,web.indexOf(":"));
            if(protocol.equals("https"))
                System.out.println("HyperText Transfer Protocol Secured");
            else
                System.out.println("HyperText Transfer Protocol");

            String extension=web.substring(web.lastIndexOf(".")+1);
            if(extension.equals("com"))
                System.out.println("Commercial");
            else if(extension.equals("org"))
                System.out.println("Net");





    }
}
