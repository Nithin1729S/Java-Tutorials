package Static;

class Test
{
    static int x =10;
    int y=30;
    void show()
    {
        System.out.println(x+y);
    }
    static void display()
    {
        System.out.println(x);
    }
}
public class StaticPractice {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.show();
    }

}
