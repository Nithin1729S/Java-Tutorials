package Array;

public class Insertion
{
    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        int idx=2;
        int i=6;
        while(i>idx)
        {
            A[i]=A[i-1];
            i--;
        }
        A[idx]=100;

        for(int value:A){
            System.out.print(value+" ");
        }
    }
}
