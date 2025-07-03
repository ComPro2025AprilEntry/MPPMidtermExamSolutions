package vehicleregistrationsystem;

public class Main {
    public static void main(String[] args) {
        Owner hadi = new Owner("Omar");
        hadi.addVehicle(new Vehicle("Mercedes", "2025", hadi));
        hadi.addVehicle(new Vehicle("Ford150", "2024", hadi));
        hadi.addVehicle(new Vehicle("CyberTrack", "2025", hadi));
        hadi.addVehicle(new Vehicle("Lexus470", "2023", hadi));

        System.out.println(hadi);
    }
}
