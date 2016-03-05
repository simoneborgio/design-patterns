package vehicles;

import engines.SlowEngine;

public class CityCar extends Vehicle {

    public CityCar(String name) {
        super();

        this.name = name;
        this.engine = new SlowEngine();
    }
}
