package shapes;

public class Cone {

    private double height;
    private double radius;

    public Cone(double height, double radius) {
        if (height > 0 || radius > 0) {
            this.height = height;
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Height or radius cannot be less than 0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
