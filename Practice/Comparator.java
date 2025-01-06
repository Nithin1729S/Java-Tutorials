import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Batsman{
    
    String name;
    int age;

    Batsman(String name,int age ){
        this.name=name;
        this.age=age;
    }

}


public class Comparator {
    public static void main(String[] args) {
        List<Batsman>batsmen=new ArrayList<>();
        batsmen.add(new Batsman("Virat", 36));
        batsmen.add(new Batsman("Rohit", 38));

        batsmen.sort((Batsman obj1, Batsman obj2) -> obj2.age - obj1.age);

        for(Batsman batter:batsmen){
            System.out.println(batter.name+" "+batter.age);
        }

    }
    
}
