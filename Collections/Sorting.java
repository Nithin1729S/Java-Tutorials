import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class Sorting {

    public void shuffle(List<Integer> list) {
        int n=list.size();
        for(int i=n-1;i>0;i--){
            int randIdx=(int) (Math.random()*(i+1));
            swap(list,i,randIdx);
        }
    }

    public void Merge(List<Integer> list, int low, int mid, int high) {
        int i = low, j = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while (i <= mid && j <= high) {
            if (list.get(i) < list.get(j)) {
                temp.add(list.get(i));
                i++;
            } else {
                temp.add(list.get(j));
                j++;
            }
        }
        while (i <= mid) {
            temp.add(list.get(i));
            i++;
        }
        while (j <= high) {
            temp.add(list.get(j));
            j++;
        }
        for (int k = low; k <= high; k++) {
            list.set(k, temp.get(k - low));
        }
    }

    public void MergeSort(List<Integer> list1, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        MergeSort(list1, low, mid);
        MergeSort(list1, mid + 1, high);
        Merge(list1, low, mid, high);
    }

    public void InsertionSort(List<Integer>list1){
        int n=list1.size();
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && list1.get(j)<list1.get(j-1)){
                swap(list1,j,j-1);
                j--;
            }
        }
    }

    public void BubbleSort(List<Integer>list){
        int n=list.size();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(list.get(j)>list.get(j+1)){
                    swap(list,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(38);
        list.add(27);
        list.add(43);
        list.add(3);
        list.add(9);
        list.add(82);
        list.add(10);
        System.out.println(list);
        Sorting sorting = new Sorting();
        sorting.MergeSort(list, 0, list.size() - 1);
        System.out.println("Merge Sort: "+list);
        sorting.shuffle(list);
        System.out.println(list);
        sorting.InsertionSort(list);
        System.out.println("Insertion Sort: "+list);
        sorting.shuffle(list);
        System.out.println(list);
        sorting.BubbleSort(list);
        System.out.println("Bubble Sort: "+list);
    }
}
