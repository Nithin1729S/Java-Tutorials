class Pen
{
    String color;
    String type;
    public void write()
    {
        System.out.println("Writing");
    }
    public void printColor()
    {
        System.out.println(this.color);
    }
}

class Student
{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name)
    {
        System.out.println(name);
    }

    public void printInfo(int age)
    {
        System.out.println(age);
    }

    public void printInfo(String name,int age)
    {
        System.out.println(name+" "+age);
    }

    Student()
    {
        System.out.println("Constructor called");
    }
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    Student(Student s)
    {
        this.name=s.name;
        this.age=s.age;
    }

}
public class OOPS
{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen1.printColor();

        Pen pen2=new Pen();
        pen2.color="red";
        pen2.type="ball";
        pen2.printColor();

        Student s1=new Student();
        Student s2=new Student("Nithin",25);
        // s2.printInfo();
        Student s3=new Student(s2);
        s3.printInfo();

    }
}