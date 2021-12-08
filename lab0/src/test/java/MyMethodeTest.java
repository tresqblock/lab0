import org.testng.annotations.Test;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import static org.testng.Assert.*;

public class MyMethodeTest {
    MyMethode methode = new MyMethode();
    @Test
    public void testMyInteger() {
        assertEquals(methode.MyInteger(1500),1);
        assertEquals(methode.MyInteger(0),0);
        assertEquals(methode.MyInteger(-1),0);
    }

    @Test
    public void testMyBoolean() {
        assertEquals(methode.MyBoolean(5),true);
        assertEquals(methode.MyBoolean(4),false);
        assertEquals(methode.MyBoolean(0),false);
    }

    @Test
    public void testMyIf() {
        assertEquals(methode.MyIf(5),6);
        assertEquals(methode.MyIf(-1),-3);
    }

    @Test
    public void testMyCase() {
        assertEquals(methode.MyCase(1),"плохо");
        assertEquals(methode.MyCase(3),"удовлетворительно");
        assertEquals(methode.MyCase(5),"отлично");
        assertEquals(methode.MyCase(6),"ошибка");
    }

    @Test
    public void testMyFor() {
        assertEquals(methode.MyFor(1,3),new int[]{1,2,3});
    }

    @Test
    public void testMyWhile() {
        assertEquals(methode.MyWhile(3,1),3);
        assertEquals(methode.MyWhile(3,2),1);
        assertEquals(methode.MyWhile(7,2),3);
    }

    @Test
    public void testMyMinMax() {
        var list = new ArrayList<Point2D>();
        list.add(new Point(1,2));
        list.add(new Point(4,1));
        list.add(new Point(6,6));
        assertEquals(methode.MyMinMax(5,list),2);
    }

    @Test
    public void testMyArray() {
        assertEquals(methode.MyArray(2),new int[] {2,4});
    }

    @Test
    public void testMyMatrix() {
        assertEquals(methode.MyMatrix(2,2),new int[][]{{5,10},{5,10}});
    }
}