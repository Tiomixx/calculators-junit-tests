package shapes;

public class Parallelogram {

    private double height;
    private double base;

    public Parallelogram(double height, double base) {
        if (height > 0 || base > 0) {
            this.height = height;
            this.base = base;
        } else {
            throw new IllegalArgumentException("Height or base cannot be less than 0!");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
