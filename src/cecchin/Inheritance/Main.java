package cecchin.Inheritance;

public class Main {
    public Main() {
        SUV myCar = new SUV();
        myCar.setType("2022");
        myCar.setType("SUV");
        myCar.setMileage(1000000);
        myCar.setCargo("lots of food");
        System.out.println(myCar.toString());

        student s1 = new student();
        human h1 = new human();
        h1.setName("Nick");

        human nick = new student();


        System.out.println(nick.makeNoise());

        Animal a = new Dog();
        a.eat();


    }

    public static void main(String[] args) {
        new Main();
    }
}
