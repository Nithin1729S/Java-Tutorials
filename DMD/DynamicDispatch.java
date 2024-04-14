package DMD;
class Super
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub Meth2");
    }
    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Super sup=new Super();
        sup.meth1();
        sup.meth2();

        Sub sub=new Sub();
        sub.meth2();
        sub.meth1();
        sub.meth3();

        Super ss=new Sub();
        ss.meth1();
        ss.meth2();
    }
}
