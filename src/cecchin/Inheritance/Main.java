package cecchin.Inheritance;

public class Main {
    public Main(){
        SUV myCar = new SUV();
        myCar.setType("2022");
        myCar.setType("SUV");
        myCar.setMileage(1000000);
        myCar.setCargo("fuck");
        System.out.println(myCar.toString());



    }
    public static void main(String[] args){
        new Main();
    }
}
