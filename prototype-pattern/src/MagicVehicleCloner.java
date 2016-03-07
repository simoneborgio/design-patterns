import vehicles.Vehicle;

public class MagicVehicleCloner {

    // this is our prototype object, the one we will clone as many times as we need

    private Vehicle vehicle;

    public MagicVehicleCloner(Vehicle vehicle) {

        // prototype object is injected via constructor

        this.vehicle = vehicle;

    }

    public Vehicle makeVehicle(){

        return vehicle.clone();

    }
}
