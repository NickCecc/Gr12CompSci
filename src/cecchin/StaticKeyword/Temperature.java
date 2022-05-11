package cecchin.StaticKeyword;

public class Temperature {
    private double temperature;
    private static double maxTemp;

    public Temperature(double temp) {
        temperature = temp;
        if (temp > maxTemp) {
            maxTemp = temp;
        }
    }

    public static double getMaxTemp() {
        return maxTemp;
    }


}
