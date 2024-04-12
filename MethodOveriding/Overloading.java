package MethodOveriding;

class Addition{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
}
public class Overloading {
    public static void main(String[] args) {
        System.out.println(Addition.add(9,5));
        System.out.println(Addition.add(8.9,4.5));
    }
}
