package Array;

public class Rotation
{
    public static void main(String[] args) {
        int A[]={1,2,4,5,6,0,7,2,9};
        int i;
        int x=A[0];
        for( i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[i-1]=x;

        for(int value:A){
            System.out.print(value+" ");
        }


    }
}

