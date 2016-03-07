import vehicles.Car;

public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {

        // save a reference to car builder
        // note you can use this very director with ANY BUILDER implementing CarBuilder interface

        this.carBuilder = carBuilder;

    }

    public void makeCar(){

        // call all build mathods of CarBuilder class

        this.carBuilder.buildEngine();
        this.carBuilder.buildTires();
        this.carBuilder.buildBrakes();

    }

    public Car getCar(){

        // return the car

        return this.carBuilder.getCar();

    }

}
