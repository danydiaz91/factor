import org.junit.Test;

import static org.junit.Assert.*;

public class FactorTest {

    @Test
    public void getFactorOK() {

        Integer entry = 5;
        Integer expected = 120;

        Integer actual = Factor.factor(entry);

        assertEquals(expected, actual);
    }

    @Test
    public void getFactorWhenEntryZero() {

        Integer entry = 0;
        Integer expected = 1;

        Integer actual = Factor.factor(entry);

        assertEquals(expected, actual);
    }

    @Test
    public void getFactorWhenEntryOne() {

        Integer entry = 1;
        Integer expected = 1;

        Integer actual = Factor.factor(entry);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFactorWhenEntryNegative() {

        Integer entry = -1;
        Factor.factor(entry);
    }

    @Test
    public void sumFactorWhenEntryFive() {

        Integer entry = 5;
        Integer expected = 3;

        Integer actual = Factor.sumFactor(entry);

        assertEquals(expected, actual);
    }

    @Test
    public void sumFactorWhenEntrySix() {

        Integer entry = 6;
        Integer expected = 9;

        Integer actual = Factor.sumFactor(entry);

        assertEquals(expected, actual);
    }
}