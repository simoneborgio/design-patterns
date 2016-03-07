package vehicles;

public abstract class Vehicle {

    private String engine;
    private String tires;
    private String brakes;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getBrakes() {
        return brakes;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public void run(){
        System.out.println("Car is running");
    }

}
