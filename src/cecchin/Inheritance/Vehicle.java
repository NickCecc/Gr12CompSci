package cecchin.Inheritance;
public class Vehicle {
    private String type;
    private double mileage;
    private String color;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String type, String color, int year) {
        setType(type);
        setColor(color);
        setYear(year);
    }

    public boolean drive(int howFar) {
        mileage += howFar;
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type is: ").append(getType()).append(" Colour is: ").append(getColor()).append(" Year is: ").append(getYear()).append("\n");
        return sb.toString();

    }
}
