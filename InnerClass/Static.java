package InnerClass;
abstract class my
{
    abstract public  void show();
}
class outer
{
    public void display()
    {
        my m = new my(){public void show(){System.out.println("Hello");}};
        m.show();
    }
}

public class Static {
    public static void main(String[] args) {
        outer o=new outer();
        o.display();

    }
}
