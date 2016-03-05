package vehicles;

import engines.FastEngine;

public class SportCar extends Vehicle {

    public SportCar(String name) {
        super();

        this.name = name;
        this.engine = new FastEngine();

    }
}
