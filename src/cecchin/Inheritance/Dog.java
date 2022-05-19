package cecchin.Inheritance;

public class Dog extends Animal{
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed;
    public void bark(){
        System.out.println("I am barking!");

    }


    public void eat(){
        System.out.println("I am eating food");
    }
}
