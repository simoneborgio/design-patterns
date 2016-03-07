import vehicles.Car;

public class CityCarBuilder implements CarBuilder {

    private Car car;

    public CityCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setEngine("Small engine");
    }

    @Override
    public void buildTires() {
        car.setTires("Standard tires");
    }

    @Override
    public void buildBrakes() {
        car.setBrakes("Standard brakes");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
