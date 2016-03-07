import vehicles.Car;

public class BuilderPatternApp {

    public static void main(String[] args) {

        // create the director class

        CarDirector cityCarDirector = new CarDirector(new CityCarBuilder());

        // build the car

        cityCarDirector.makeCar();

        // and get it

        Car cityCar = cityCarDirector.getCar();

        // now you have a new car, all the CREATION COMPLEXITY was hidden inside the Builder and Director classes

        // finally, run it

        cityCar.run();

    }

}
