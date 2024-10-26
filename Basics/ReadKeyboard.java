import java.util.*;
public class ReadKeyboard
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		System.out.println("Sum is "+z);
	}

}
