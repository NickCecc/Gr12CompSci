package cecchin.StaticKeyword;

public class Rectangle {

    public static int getArea(int l, int w){
        return l * w;
    }

    public static void stars(int l, int h){
        for (int i = 0; i < h; i++){
            System.out.println();
            for (int j = 0; j < l; j++){
                System.out.print("*");
            }
        }

    }


}
