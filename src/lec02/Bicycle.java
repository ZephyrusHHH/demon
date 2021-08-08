package lec02;
import java.util.Scanner;


public class Bicycle {
    protected String brand = "Giant";

    protected void district() {
        System.out.println("China Taiwan");
    }

}

class My_bicycle extends Bicycle {
    private String model = "ATX750";

    @Override
    protected void district() {
        System.out.print("Made in ");
        super.district();

    }

    public static void main(String[] args) {
        My_bicycle bike = new My_bicycle();
        System.out.println(bike.brand + " " + bike.model);
        bike.district();
        int a= 1907222222;
        System.out.println(a);
        long id_name= 192_168_101_1L;
        System.out.println(id_name);


    }
}

