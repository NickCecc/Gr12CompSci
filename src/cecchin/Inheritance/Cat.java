package cecchin.Inheritance;

public class Cat extends Animal {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public void meow(){
        System.out.println("I am meow!");

    }

}
