package at.aau.serg.exercises.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyMathTest {

    @Test

    public void testAdd() {
        MyMath mm = new MyMath();
        Double result = mm.add(10d, 5d);
        //here I had to put delta, because there was an error
        assertEquals(15.0d, result, 0.0001);

    }

    @Test
    public void testSub() {
        MyMath mm = new MyMath();
        Double result = mm.sub(10d, 5d);
        assertEquals(5.0d, result, 0.0001);
    }

    @Test
    public void testMul() {
        MyMath mm = new MyMath();
        Double result = mm.mul(10d, 5d);
        assertEquals(50.0d, result, 0.0001);
    }

    @Test
    public void testDiv() {
        MyMath mm = new MyMath();
        Double result = mm.div(10d, 5d);
        assertEquals(2d, result, 0.0001);
    }

    @Test
    public void x2() {
        Fraction f = new Fraction(1,1);
        MyMath mm = new MyMath();
        Fraction reduced = mm.reduce(f);
        assertEquals(new Integer(1),reduced.getNumerator());
        assertEquals(new Integer(1),reduced.getDenumerator());

        f = new Fraction(10,6);
        mm = new MyMath();
        reduced = mm.reduce(f);
        assertEquals(new Integer(5),reduced.getNumerator());
        assertEquals(new Integer(3),reduced.getDenumerator());

        f = new Fraction(10,5);
        mm = new MyMath();
        reduced = mm.reduce(f);
        assertEquals(new Integer(2),reduced.getNumerator());
        assertEquals(new Integer(1),reduced.getDenumerator());

        f = new Fraction(10,5);
        mm = new MyMath();
        Double aDouble = mm.toDouble(f);
        assertEquals(new Double(2),aDouble);

        f = new Fraction(10,4);
        mm = new MyMath();
        aDouble = mm.toDouble(f);
        assertEquals(new Double(2.5d),aDouble);
    }
}
