package Methods;

public class Max
{
    static int max(int ...A)
    {
        if(A.length==0) return Integer.MIN_VALUE;
        int max=A[0];
        for(int x:A)
        {
            if(x>max) max=x;
        }
        return max;
    }

    static int sum(int ...A)
    {
        if(A.length==0) return Integer.MIN_VALUE;
        int sum=0;
        for(int x:A)
        {
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(max());
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));

    }
}
