package calculators.test;

import exceptions.IllegalArgumentException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import calculators.Geometry2DCalculator;
import shapes.Circle;
import shapes.Parallelogram;
import shapes.Triangle;

public class Geometry2DTest {

    Geometry2DCalculator geometry2DCalculator;

    @Before
    public void hello() throws IllegalArgumentException {
        geometry2DCalculator = new Geometry2DCalculator(new Triangle(5.0, 6.0, 7.0), new Circle(15.0), new Parallelogram(5.0, 3.0));
    }

    @Test
    public void testTriangle() {
        Assert.assertEquals(14.696938456699069, geometry2DCalculator.getAreaOfTriangle(), 0.0000000001);
    }

    @Test
    public void testCircle() {
        Assert.assertEquals(706.8583470577034, geometry2DCalculator.getAreaOfCircle(), 0.000000001);
    }

    @Test
    public void testParallelogram() {
        Assert.assertEquals(15.0, geometry2DCalculator.getAreaOfParallelogram(), 0.000000001);
    }
}
