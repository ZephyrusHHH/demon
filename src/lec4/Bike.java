package lec4;

public class Bike implements BikeAttr {
    protected String type = null;
    protected String color = null;

    public Bike(String type, String color) {
        this.type = type;
        this.color = color;
    }


    @Override
    public Float speedup() {
        return null;
    }

    @Override
    public Float brakedown() {
        return null;
    }

    public static void main(String[] args) {
        Bike bike = new Bike("test","red");
    }
}
