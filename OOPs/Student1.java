package OOPs;

class Student
{
    public int rollNo;
    public String name;
    public String course;
    public int m1;
    public int m2;
    public int m3;
    public double total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if(average()>=60) return 'A';
        else return 'B';
    }
    public String toString()
    {
        return "Roll No:"+rollNo+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";

    }
}
public class Student1
{
    public static void main(String[] args)
    {
        Student s=new Student();
        s.rollNo=1;
        s.name="John";
        s.course="CS111";
        s.m1=90;
        s.m2=90;
        s.m3=90;

        System.out.println("Total: "+s.total());
        System.out.println("Average: "+s.average());
        System.out.println("Grade: "+s.grade());
        System.out.println(s);
    }
}
