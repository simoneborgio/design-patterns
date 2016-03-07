package vehicles;

public abstract class Vehicle implements Cloneable {

    public Vehicle clone(){

        // some complexity is managed here: erro catching for object cloning and type casting

        try {

            Vehicle clone = (Vehicle) super.clone();

            // here we could do something with our cloned object, like setting some attributes or call methods...

            return clone;

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();

            return null;
        }

    }

    public abstract void run();

}
