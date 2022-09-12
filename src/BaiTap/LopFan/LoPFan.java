package BaiTap.LopFan;

public class LoPFan {
    private final int SLOW = 1, MEDIUM = 2, FAST =3;
    private int SPEED = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public LoPFan() {
    }

    public LoPFan(int SPEED, boolean on, double radius, String color) {
        this.SPEED = SPEED;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSPEED() {
        return SPEED;
    }

    public void setSPEED(int SPEED) {
        this.SPEED = SPEED;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on){
            return SPEED + " , " + true + " , " + radius +  " , " + color + " Fan is on";
        }else {
            return false + " , " + radius +  " , " + color + " Fan is off";
        }
    }
}
