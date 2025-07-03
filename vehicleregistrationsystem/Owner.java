package vehicleregistrationsystem;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    List<Vehicle> vehicles;

    public Owner(String name) {
        this.name = name;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle getVehicle(Vehicle vehicle) {
        for (Vehicle v : vehicles) {
            if (vehicle.getMake().equals(v.getMake()) && vehicle.getMakeYear().equals(v.getMakeYear())) return v;
        }
        return null;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public String toString() {
        return name + " has the following car(s):\n" + vehicles;
    }
}
