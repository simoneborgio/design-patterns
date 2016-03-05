package vehicles;

import engines.SlowEngine;

public class CityCar extends Vehicle {

    public CityCar(String name) {
        super();

        this.setName(name);
        this.setEngine(new SlowEngine());
    }

}
