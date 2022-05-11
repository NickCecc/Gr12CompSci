package cecchin.StaticKeyword;

public class Main {
    public Main() {
        System.out.println(Rectangle.getArea(5, 10));

        Rectangle.stars(5, 5);
        System.out.println();


        Temperature t1 = new Temperature(75);
        Temperature t2 = new Temperature(100);
        Temperature t3 = new Temperature(65);

        System.out.println(Temperature.getMaxTemp());


    }


    public static void main(String[] args) {
        new Main();
    }
}
