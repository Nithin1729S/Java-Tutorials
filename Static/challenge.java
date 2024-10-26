package Static;
import java.util.*;
class Student
{
    private String rollNo;
    private static int count=1;//shared with all students objects
    private String generateRollNo()
    {
        Date d=new Date();
        String res="Univ-"+(d.getYear()+1900)+"_"+count;
        count++;
        return res;

    }
    public Student()
    {
        rollNo=generateRollNo();
    }
    public void getRollNo()
    {
        System.out.println(rollNo);
    }
}
public class challenge {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.getRollNo();
        s2.getRollNo();

    }
}
