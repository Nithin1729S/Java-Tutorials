package Methods;

public class reverse
{
    static int reverse(int a)
    {
        int reverse=0;
        while(a>0)
        {
            int digit=a%10;
            reverse=reverse*10+digit;
            a=a/10;
        }
        return reverse;
    }

    static void reverse(int A[])
    {
        for(int i=0;i<A.length/2;i++)
        {
            int temp=A[i];
            A[i]=A[A.length-1-i];
            A[A.length-1-i]=temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(67));

        int A[]={1,2,3,4,5};
        reverse(A);
        for(int x:A) System.out.print(x+" ");
    }
}
