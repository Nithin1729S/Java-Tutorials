package Inheritance;
class A{
    A()
    {
        System.out.println("A's Constructor");
    }
}

class B extends A{
    B()
    {   
        // super();
        System.out.println("B's Constructor");
    }
}

class C extends B{
    C()
    {
        System.out.println("C's Constructor");
    }
}
public class Mul {
    public static void main(String[] args) {
        C c= new C();
    }
}
