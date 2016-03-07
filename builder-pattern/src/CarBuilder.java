import vehicles.Car;

public interface CarBuilder {

    void buildEngine();

    void buildTires();

    void buildBrakes();

    Car getCar();

}
