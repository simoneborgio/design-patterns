package vehicles;


public abstract class Vehicle {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name + " is running");
    }

}
