package shapes;

public class Tetrahedron {
    private double areaOfSide;
    private double height;

    public Tetrahedron(double areaOfSide, double height) {
        this.areaOfSide = areaOfSide;
        this.height = height;
    }

    public double getAreaOfSide() {
        return areaOfSide;
    }

    public void setAreaOfSide(double areaOfSide) {
        this.areaOfSide = areaOfSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
