package ss4_oop_and_object.bai_tap;

public class Lop_Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.tostring());
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(fan1.medium);
        fan2.getRadius();
        fan2.getColor();
        System.out.println(fan2.tostring());
    }
}

class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public String tostring() {
        if (on) {
            return "speed: " + getSpeed() + " , " + "color: " + getColor() + " , " + "radius: " + getRadius() + " , " + " fan is on";
        } else {
            return "color: " + getColor() + " , " + "radius: " + getRadius() + " , " + " fan is off";
        }
    }
}


