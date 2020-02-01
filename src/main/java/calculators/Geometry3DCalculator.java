package calculators;

import shapes.Cone;
import shapes.Cylinder;
import shapes.Tetrahedron;

public class Geometry3DCalculator {

    private double volume;
    private Cone cone;
    private Cylinder cylinder;
    private Tetrahedron tetrahedron;

    public Geometry3DCalculator(Cone cone, Cylinder cylinder, Tetrahedron tetrahedron) throws IllegalArgumentException {
        this.cone = cone;
        this.cylinder = cylinder;
        this.tetrahedron = tetrahedron;
    }

    public double getConeVolume() throws IllegalArgumentException {
        if (cone.getRadius() <= 0 || cone.getHeight() <= 0) {
            throw new IllegalArgumentException("One of the cone parameters is less than 0");
        }
        volume = (cone.getHeight() / 3) * Math.PI * cone.getRadius() * cone.getRadius();
        return volume;
    }

    public double getCylinderVolume() throws IllegalArgumentException {
        if (cylinder.getRadius() <= 0 || cylinder.getHeight() <= 0) {
            throw new IllegalArgumentException("One of the cylinder parameters is less than 0");
        }
        volume = Math.PI * (cylinder.getRadius() * cylinder.getRadius()) * cylinder.getHeight();
        return volume;
    }

    public double getTetrahedronVolume() throws IllegalArgumentException {
        if (tetrahedron.getAreaOfSide() <= 0 || tetrahedron.getHeight() <= 0) {
            throw new IllegalArgumentException("One of the tetrahedron parameters is less than 0");
        }
        volume = ((tetrahedron.getAreaOfSide() * tetrahedron.getHeight()) / 3);
        return volume;
    }


}
