package Methods;

public class intro {

    static  int max(int x,int y)
    {
        if(x>y)
            return x;
        return y;
    }
    public static void main(String[] args)
    {
            int a=10,b=6;
            int c;
            c=max(a,b);

            System.out.println(c);

    }
}
