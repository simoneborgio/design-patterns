import vehicles.CityCar;
import vehicles.SportCar;
import vehicles.Vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType, String name){

        if("CITY CAR".equals(vehicleType)){

            return new CityCar(name);

        } else if("SPORT CAR".equals(vehicleType)) {

            return new SportCar(name);

        }

        return null;

    }

}
