package calculators;

import shapes.Circle;
import shapes.Parallelogram;
import shapes.Triangle;

public class Geometry2DCalculator {

    private Triangle triangle;
    private Circle circle;
    private Parallelogram parallelogram;
    public double area;
    public double halfPerimeter;


    public Geometry2DCalculator(Triangle triangle, Circle circle, Parallelogram parallelogram) throws IllegalArgumentException {
        this.triangle = triangle;
        this.circle = circle;
        this.parallelogram = parallelogram;
    }

    public double getAreaOfTriangle() {
        halfPerimeter = (triangle.getAb() + triangle.getBc() + triangle.getAc()) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - triangle.getAb()) * (halfPerimeter - triangle.getBc()) * (halfPerimeter - triangle.getAc()));
        return area;
    }

    public double getAreaOfCircle() {
        area = circle.getRadius() * circle.getRadius() * Math.PI;
        return area;
    }

    public double getAreaOfParallelogram() {
        area = parallelogram.getHeight() * parallelogram.getBase();
        return area;
    }
}
