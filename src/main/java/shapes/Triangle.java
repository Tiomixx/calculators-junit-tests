package shapes;

import exceptions.IllegalArgumentException;

public class Triangle {
    private double ab;
    private double bc;
    private double ac;

    public Triangle(double ab, double bc, double ac) throws IllegalArgumentException {
        if (ab <= 0.0 || bc <= 0.0 || ac <= 0.0) {
            throw new IllegalArgumentException("The side of the triangle is less than or equal to 0.0");
        }
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    public double getBc() {
        return bc;
    }

    public void setBc(double bc) {
        this.bc = bc;
    }

    public double getAc() {
        return ac;
    }

    public void setAc(double ac) {
        this.ac = ac;
    }
}
