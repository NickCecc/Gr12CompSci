package cecchin.Inheritance;

public class SUV extends Vehicle {
    String Cargo;

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Cargo is: " + Cargo);
        return sb.toString();
    }
}
