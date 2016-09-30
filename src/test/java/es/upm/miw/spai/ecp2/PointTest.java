package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point p;

    @Before
    public void before() {
        p = new Point(2, 3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, p.getX());
        assertEquals(3, p.getY());
    }

    @Test
    public void testPunto() {
        p = new Point();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, p.module(), 10e-5);
    }

    @Test
    public void testPhase() {
        assertEquals(0.9828, p.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.p.translateOrigin(new Point(1, 1));
        assertEquals(1, p.getX());
        assertEquals(2, p.getY());
    }
    
    @Test
    public void testSetX() {
        assertEquals(3,p.setX(3));
    }

    @Test
    public void testSetY() {
        assertEquals(4,p.setY(4));
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3]", p.toString());
    }

}
