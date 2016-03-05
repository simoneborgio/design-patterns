package vehicles;

import engines.Engine;

public abstract class Vehicle {

    protected String name;
    protected Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void run(){

        System.out.println(name + " is running: " + engine.run());

    }
}
