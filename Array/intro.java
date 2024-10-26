package Array;

public class intro
{
    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};

        int sum=0;
        int max1=B[0];
        int max2=B[1];
        for(int x:B)
        {
            if(x>max1) {
                max2=max1;
                max1=x;

            }
            else
            {
                if(x>max2 && x!=max2) max2=x;
            }
        }
        System.out.println(max2);
    }

}