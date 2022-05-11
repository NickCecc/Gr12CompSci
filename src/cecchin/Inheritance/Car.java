package cecchin.Inheritance;

public class Car extends Vehicle {

    private String make;
    private String model;
    private int speed;

    public Car() {
        // empty constructor in Vehicle is implicitly called here

    }

    public Car(String make, String model, int year, String color) {
        // empty constructor in Vehicle is implicitly called here

        setMake(make);
        setModel(model);
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

