package drawing.test;

import drawing.model.Point;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    //        Testirati da li za tačke (0,0) i (3,4) metoda distance vraća vrednost 5.0.
    public void distanceTest() {
        Point a = new Point(0,0);
        Point b = new Point(3,4);
        Assert.assertEquals("Distance for point not correct", 5.0, a.distance(b), 0);
    }

}