package Inheritance;

class Parent_
{
    Parent_()
    {
        System.out.println("Non Param Of Parent");
    }

    Parent_(int x)
    {
        System.out.println("Param Of Parent");
    }
}

class CHild extends Parent_
{
    CHild()
    {
        System.out.println("Non Param of CHlid");
    }
    CHild(int y)
    {
        System.out.println("Param of Child");
    }

    CHild(int x,int y)
    {
        super(x);
        System.out.println("2 param of"+y);
    }
}
public class paraInt
{
    public static void main(String[] args) {
        CHild c=new CHild(4,5);
    }
}
