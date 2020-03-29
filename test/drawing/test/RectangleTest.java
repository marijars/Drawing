package drawing.test;

import drawing.model.Point;
import drawing.model.Rectangle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    //      Testirati da li za pravougaonik širine 6 i visine 4 metoda area vraća vrednost 24.
//        r.setWidth(6);
//        r.setHeight(4);
//        System.out.println(r.area());
    public void areaTest() {
        Rectangle r = new Rectangle(new Point(0,0),6,4);
        Assert.assertEquals("Area for rectangle not correct", 24, r.area(), 0);
    }
}