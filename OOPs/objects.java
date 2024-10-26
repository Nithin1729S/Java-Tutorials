package OOPs;

class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}

    public void setMarks(int num)
    {
        maxMarks=num;
    }
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    public String toString()
    {
        return "\nSubject Id:"+subID+"\nName: "+name+"\nMarks Obtained: "+marksObtain;
    }
}
public class objects {

    public static void main(String[] args) {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DSA",100);
        subs[1]=new Subject("s102","ACD",100);
        subs[2]=new Subject("s103","OS",100);

        for(Subject s:subs)
        {
            System.out.println(s);
        }
    }
}
