package vehicles;

import engines.FastEngine;

public class SportCar extends Vehicle {

    public SportCar(String name) {
        super();

        this.setName(name);
        this.setEngine(new FastEngine());

    }
}
