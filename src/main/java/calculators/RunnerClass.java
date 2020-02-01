package calculators;

import shapes.*;
import exceptions.IllegalArgumentException;

public class RunnerClass {
    public static void main(String[] args) {
        try {
            Geometry2DCalculator geometry2DCalculator = new Geometry2DCalculator(new Triangle(5.0, 6.0, 7.0), new Circle(15.0), new Parallelogram(5.0, 3.0));
            Geometry3DCalculator geometry3DCalculator = new Geometry3DCalculator(new Cone(10.0, 10.0), new Cylinder(10.0, 10.0), new Tetrahedron(10.0, 10.0));
            System.out.println(geometry2DCalculator.getAreaOfTriangle() + " - area of triangle");
            System.out.println(geometry2DCalculator.getAreaOfCircle() + " - area of circle");
            System.out.println(geometry2DCalculator.getAreaOfParallelogram() + " - area of parallelogram");

            System.out.println(geometry3DCalculator.getConeVolume() + " - volume of cone");
            System.out.println(geometry3DCalculator.getCylinderVolume() + " - volume of cylinder");
            System.out.println(geometry3DCalculator.getTetrahedronVolume() + " - volume of tetrahedron");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
