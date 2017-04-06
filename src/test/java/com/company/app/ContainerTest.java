package com.company.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by xk on 04.04.17.
 *
 *
 import static org.junit.Assert.assertEquals;
 import org.junit.Test;
 */

public class ContainerTest {
    @Test
    public void lengthTest() {
        Container container = new Container();
        int len = container.getList().size();
        assertEquals(10, len);

        container = new Container(4,"Brown", "Blue", "Yellow", "Violet");
        len = container.getList().size();
        assertEquals(4, len);

        container = new Container(12);
        len = container.getList().size();
        assertEquals(12, len);
    }

    @Test
    public void comparisionTest() {
        Container container1 = new Container(5);
        Container container2 = new Container(10);
        Container container2_clone = new Container(container2);

        boolean gt = container1.isGreater(container2);
        assertEquals(false, gt);

        boolean lt = container1.isLesser(container2);
        assertEquals(true, lt);

        boolean eq = container1.equals(container2);
        assertEquals(false, eq);

        eq = container2.equals(container2_clone);
        assertEquals(true, eq);
    }

    @Test
    public void arithmeticTest() throws NotExistException {
        Container container1 = new Container(4, "Brown", "Blue", "Yellow", "Violet");
        Container container2 = new Container(6, "Brown", "Blue", "Yellow", "Violet", "Yellow", "Violet");

        Container expected = new Container(10, "Brown", "Blue", "Yellow", "Violet", "Brown", "Blue", "Yellow", "Violet", "Yellow", "Violet");
        Container got = container1.add(container2);
        assertEquals(expected, got);

        expected = new Container(2, "Yellow", "Violet");
        got = container2.sub(container1);
        assertEquals(expected, got);
    }


    @Test(expected = NotExistException.class)
    public void exceptionTest() throws NotExistException{
        Container container1 = new Container(4, "Brown", "Blue", "Yellow", "Violet");
        Container container2 = new Container(6, "Brown", "Blue", "Yellow", "Violet", "Yellow", "Violet");

        container1.sub(container2);
    }

    @Test
    public void containsTest() {
        Container container1 = new Container(4, "Brown", "Blue", "Yellow", "Violet");
        Container container2 = new Container(6, "Brown", "Blue", "Yellow", "Violet", "Yellow", "Violet");

        boolean got = container1.contains(container2);
        assertEquals(false, got);

        got = container2.contains(container1);
        assertEquals(true, got);
    }

    @Test
    public void clearTest() {
        Container container = new Container();
        Container expected = new Container(0);

        container.clear();
        Container got = new Container(container);

        assertEquals(expected, got);
    }
}


