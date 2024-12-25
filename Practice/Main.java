interface Bike{
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;

    public void turnOnEngine(){
        isEngineOn = true;
    }   
    public void accelerate(){
        if(isEngineOn){
            speed += 10;
        }
    }
}

class Bicyle implements Bike{
    int speed;

    public void turnOnEngine(){
        System.out.println("Bicycle does not have an engine");
    }   
    public void accelerate(){
        speed += 5;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
