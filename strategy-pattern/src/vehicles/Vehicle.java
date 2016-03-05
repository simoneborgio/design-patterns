package vehicles;

import engines.Engine;

public abstract class Vehicle {

    private String name;
    private Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {

        // This method allows injection of a new engine.
        // Since run method uses engine.run() this allows to actually change the algorithm Vehicle subclass will use

        this.engine = engine;

    }

    public void run(){

        // this uses engine.run()

        System.out.println(name + " is running: " + engine.run());

    }
}
