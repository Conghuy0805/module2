package ss7_abstractClass_interface.bai_tap;

public class Rectangle extends Area implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình chữ nhật sau khi tăng lên " + percent + " :");
        System.out.println(Math.PI * Math.pow((radius + percent), 2));
    }
}
