package vehicleregistrationsystem;

public class Vehicle {
    private String make;
    private String makeYear;
    private Owner owner;

    Vehicle(String make, String makeYear, Owner owner) {
        this.owner = owner;
        this.make = make;
        this.makeYear = makeYear;
    }

    public String getMake() {
        return make;
    }

    public String getMakeYear() {
        return makeYear;
    }

    @Override
    public String toString() {
        return "[Make: " + make + " make year: " + makeYear + "]";
    }
}
