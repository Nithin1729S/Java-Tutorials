import java.util.ArrayList;
import java.util.List;

class Vehicle {
    public Integer getNumberOfWheels() {
        return 2; // Default assumption for a generic vehicle
    }
}

class EngineVehicle extends Vehicle{
    public boolean hasEngine() {
        return true; // Default assumption for a generic vehicle
    }
}

class MotorCycle extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 2; // Motorcycles typically have 2 wheels
    }
}

class Car extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4; // Cars typically have 4 wheels
    }
}

class Bicycle extends Vehicle{
    
}

public class LSP {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        vehicles.add(new Bicycle());

        for (Vehicle vehicle : vehicles) {
           System.out.println(vehicle.getNumberOfWheels().toString());
        }
    }
}
