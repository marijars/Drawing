package drawing.test;

import drawing.model.Circle;
import drawing.model.Point;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    //     Testirati da li za krug poluprečnika 3 metoda area vraća vrednost 28.274… .
    public void testArea() {
        Circle o = new Circle(new Point(0,0),3);
        Assert.assertEquals("Area for circle not correct", 28.274, o.area(), 0.001);
    }
}