package cecchin.Inheritance;

public class Truck extends Vehicle {

    private String load;
    private String make;
    private String model;

    public Truck() {
        // empty constructor in Vehicle is implicitly called here

    }

    public Truck(String make, String model, int year, String color, String load) {
        // empty constructor in Vehicle is implicitly called here

        setMake(make);
        setModel(model);
        setLoad(load);
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // overrides method in superclass because it has the same method signature
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Make is: ").append(getMake()).append(" Model is: ").append(getModel()).append("\n");
        return sb.toString();
    }
}
