package StringMatching;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        System.out.println(str1.matches("[abc]*"));
          String str;
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter your email ID\n");
          str=sc.nextLine();
          if (str.matches("[a-zA-Z0-9._%+-]+@gmail\\.com"))
          {
              int i=str.indexOf('@');
              String uname=str.substring(0,i);
              String uaddr=str.substring(i+1);
              System.out.println("Username: "+uname);
              System.out.println("Email Provider: "+uaddr);
          }
          else
          {
            System.out.println("Enter valid email.");
          }





    }
}
