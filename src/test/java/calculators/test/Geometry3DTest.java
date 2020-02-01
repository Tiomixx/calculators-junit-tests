package calculators.test;

import calculators.Geometry3DCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import shapes.Cone;
import shapes.Cylinder;
import shapes.Tetrahedron;

public class Geometry3DTest {

    Geometry3DCalculator geometry3DCalculator;

    @Before
    public void hello() throws IllegalArgumentException {
        geometry3DCalculator = new Geometry3DCalculator(new Cone(10.0, 10.0), new Cylinder(10.0, 10.0), new Tetrahedron(10.0, 10.0));
    }

    @Test
    public void testCone() {
        Assert.assertEquals(1047.1975511965977, geometry3DCalculator.getConeVolume(), 0.0000001);
    }

    @Test
    public void testCylinder() {
        Assert.assertEquals(3141.5926535897934, geometry3DCalculator.getCylinderVolume(), 0.0000001);
    }

    @Test
    public void testTetrahedron() {
        Assert.assertEquals(33.333333333333336, geometry3DCalculator.getTetrahedronVolume(), 0.00000001);
    }
}
