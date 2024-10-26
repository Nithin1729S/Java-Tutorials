package Array;

public class Deletion
{
    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        int idx=1;
        int size=6;
        int i = idx;

        while (i < size) {
            A[i - 1] = A[i];
            i++;
        }
        size--;
        for(i=0;i<size;i++) System.out.println(A[i]+" ");



    }
}
