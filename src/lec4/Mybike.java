package lec4;

import java.sql.SQLOutput;



public class Mybike extends Bike implements BikeAttr {
    protected Float currentSpeed = 0.0f;
    protected static Float speed_1 = 0.1f;
    final Float increase = 50.0f;

    public Mybike(String type, String color) {
        super(type, color);
        this.currentSpeed = this.speedup(this.currentSpeed);
        System.out.println(this.currentSpeed);

        //this.currentSpeed = super.speedup();
        //System.out.println(currentSpeed);
        //increase=0.0f;

    }

    public Mybike(String type, String color, Float currentSpeed) {
        super(type, color);
        this.currentSpeed = currentSpeed;
    }

    public static Float speedup(Float speed) {
        //currentSpeed=0;
        speed_1 = 1.0f;
        speed = speed + 10;
        return speed;
    }

    public void brakedown(Float speed) {
        this.currentSpeed = this.currentSpeed - 1.0f;
    }

    public static void main(String[] args) {
        Mybike mybike = new Mybike("Giant", "Blue");

        //System.out.println(mybike.type);
        //System.out.println(speed_1);
        //mybike.brakedown(1.0f);
        //System.out.println(mybike.currentSpeed);

    }
}
