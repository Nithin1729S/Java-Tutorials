import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MyCollectionsExample {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        // values.forEach((Integer val) -> System.out.println(val));

        System.out.println(values.size());
        System.out.println(values.isEmpty());

        System.out.println(values.contains(7));

        Collections.sort(values); // This now refers to java.util.Collections

        for(Integer ele:values)
        {
            System.out.println(ele);
        }
        
    }
}
