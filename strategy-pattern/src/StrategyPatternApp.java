import engines.FastEngine;
import vehicles.CityCar;
import vehicles.SportCar;
import vehicles.Vehicle;

public class StrategyPatternApp {

    public static void main(String[] args) {

        Vehicle sportCar = new SportCar("Sport car");
        Vehicle cityCar = new CityCar("City car");

        System.out.println("Both cars can run as soon as they are created:\n");

        sportCar.run();
        cityCar.run();

        System.out.println("\nBut strategy pattern allows you to mount a new fast engine on your city car, and:\n");

        // here we cange city car's engine

        cityCar.setEngine(new FastEngine());
        cityCar.run();

        System.out.println("\nStrategy pattern allows you to change a class BEHAVIOR at runtime, injecting a new object in the class as long as it implements the required interface.");
        System.out.println("In several scenarios, this is much more effective and concise than inheritance, expecially if your class can have several different behaviors: we could decide to change car's springs, tires, brakes, etc, etc");

    }

}
