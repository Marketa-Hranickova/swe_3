package at.aau.serg.exercises.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    private MyMath mm;

    @BeforeEach
    public void setUp() {
        mm = new MyMath();
    }

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
    public void testFractionReduce_Simple() {
        Fraction f = new Fraction(1, 1);
        Fraction reduced = mm.reduce(f);
        assertEquals(1, reduced.getNumerator(), 0.0001);
        assertEquals(1, reduced.getDenumerator(), 0.0001);
    }

    @Test
    public void testFractionReduce_Complex() {
        Fraction f = new Fraction(10, 6);
        Fraction reduced = mm.reduce(f);
        assertEquals(5, reduced.getNumerator(), 0.0001);
        assertEquals(3, reduced.getDenumerator(), 0.0001);
    }

    @Test
    public void testFractionToDouble_Simple() {
        Fraction f = new Fraction(10, 5);
        Double aDouble = mm.toDouble(f);
        assertEquals(2.0, aDouble, 0.0001);
    }

    @Test
    public void testFractionToDouble_Decimal() {
        Fraction f = new Fraction(10, 4);
        Double aDouble = mm.toDouble(f);
        assertEquals(2.5, aDouble, 0.0001);
    }
}
