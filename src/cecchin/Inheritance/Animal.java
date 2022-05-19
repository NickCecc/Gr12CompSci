package cecchin.Inheritance;

public class Animal {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    public void eat(){
        System.out.println("I am eating!");

    }
}
