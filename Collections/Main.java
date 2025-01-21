import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer>list1=new Vector<>();
//        list1.addFirst(1);
//        list1.forEach((Integer ele)->System.out.println(ele));
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number");
//        int n=sc.nextInt();
//        String str=switch (n){
//            case 1 ->{
//                yield "One";
//            }
//            case 2 -> {
//                yield "Two";
//            }
//            default -> {
//                yield "Fuck You";
//            }
//        };
//        System.out.println(str);
//
//        HashMap<Integer,String>mp=new HashMap<>();
//        mp.put(1,"One");
//        for(Map.Entry<Integer,String>entry:mp.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

        List<Integer>vec=new ArrayList<>();
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(1);
        vec.add(2);
        System.out.println(vec);
        //Integer n=vec.size();
//        for(int i=0;i<vec.size();i++){
//            int j=i;
//            while(j>0 && vec.get(j) < vec.get(j - 1)){
//                Integer temp=vec.get(j);
//                vec.set(j,vec.get(j - 1));
//                vec.set(j-1,temp);
//                j--;
//            }
//        }
        System.out.println(vec);
        Sorting sorting=new Sorting();
        sorting.MergeSort(vec,0,vec.size()-1);
        System.out.println(vec);









    }
}
