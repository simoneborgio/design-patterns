import vehicles.Airplane;
import vehicles.Car;
import vehicles.Vehicle;

public class PrototypePatternApp {

    public static void main(String[] args) {

        // we create the objets we are going to clone

        Car car = new Car();
        Airplane airplane = new Airplane();

        // the we can create the cloner objects (or factories if you prefer this name)

        MagicVehicleCloner carFactory = new MagicVehicleCloner(car);
        MagicVehicleCloner airplaneFactory = new MagicVehicleCloner(airplane);
        
        // now we can create as many instance of these ojects as we need at runtime 
        // (we don't need to know the exact number in advance)

        for (int i = 0; i < 10; i++) {
            Vehicle carClone = carFactory.makeVehicle();
            Vehicle airplaneClone = airplaneFactory.makeVehicle();

            // check every istance of car and airplane has a different object id

            System.out.println("Car clone object id: " + carClone.hashCode());
            System.out.println("Airplane clone object id: " + airplaneClone.hashCode());

            // finally you can use the new instance

            carClone.run();
            airplaneClone.run();

            System.out.println("- - - -");

        }

    }

}
