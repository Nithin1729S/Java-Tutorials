package Inheritance;

class TV
{
    public void switchON(){
        System.out.println("TV is Switched On");
    }
    public void changeChannel()
    {
        System.out.println("Tv Channel is Changed");
    }
}

class SmartTV extends TV
{
    @Override
    public void switchON(){
        System.out.println("Smart TV is Switched On");
    }
    @Override
    public void changeChannel()
    {
        System.out.println("Smart Tv Channel is Changed");
    }

    public void browse()
    {
        System.out.println("Smart TV Browsing ");
    }
}
public class Overiding {
    public static void main(String[] args) {
        TV t=new TV();
        t.switchON();
        t.changeChannel();
        SmartTV s=new SmartTV();
        s.switchON();

//        SmartTV s2=new TV();
        TV t2=new SmartTV();
        t2.changeChannel();
        t2.switchON();
    }
}
