package Interface;
interface Test
{
    void meth1();
    void meth2();
}
class My implements Test
{
    public void meth1()
    {
        System.out.println("Meth1 of class My");
    }
    public void meth2()
    {
        System.out.println("Meth2 of Class My");
    }

    public void meth3()
    {
        System.out.println("Meth 3 of class My");
    }
}
public class interfacePractice {
    public static void main(String[] args) {
        Test t = new My();
        t.meth1();
        t.meth2();
    }
}
