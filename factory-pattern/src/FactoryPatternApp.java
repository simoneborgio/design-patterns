import vehicles.Vehicle;

public class FactoryPatternApp {

    public static void main(String[] args) {

        // instantiate the factory

        VehicleFactory factory = new VehicleFactory();

        System.out.println("A new factory is in town and it's creating vehicles like there's no tomorrow!\n");

        // use the factory to create new objects

        Vehicle cityCar = factory.getVehicle("CITY CAR", "City Car");
        Vehicle sportCar = factory.getVehicle("SPORT CAR", "Sport Car");

        System.out.println("And these vehicles run really good:\n");

        cityCar.run();
        sportCar.run();

        System.out.println("\nUse factory pattern when you want to CREATE CLASSES AT RUNTIME");
        System.out.println("And when these classes share the SAME SUPERCLASS");
        System.out.println("You don't need to know every single class the factory is returning: just pass some parameters to its static method, let the factory select the correct objet for you and then just use it.");


    }

}
