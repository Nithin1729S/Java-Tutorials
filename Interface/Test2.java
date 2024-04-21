package Interface;
class Phone
{
    public void call(){System.out.println("Phone call");}
    public void sms(){System.out.println("Phone Sms");}
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videocall(){System.out.println("Smart Phone Video Calling");}
    public void click(){System.out.println("Smart Phone Clicking Photo");}
    public void record(){System.out.println("Smart Phone Recording Video");}
    public void play(){System.out.println("Smart Phone playing music");}
    public void stop(){System.out.println("Smart Phone Stops");}

}
public class Test2 {
    public static void main(String[] args) {
        SmartPhone sp =new SmartPhone();
        sp.call();
        sp.play();
        Phone p=sp;
        p.call();
        ICamera c=sp;
        c.click();

    }
}
