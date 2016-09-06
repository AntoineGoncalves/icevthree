package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddingTest {

    @Test
    public void testCalculate() {
        assertEquals(24, AddingMachine.getInstance().calculate(13, 11), 0);
    }

    @Test
    public void testCalculateZero() {
        assertEquals(42, AddingMachine.getInstance().calculate(42, 0), 0);
        assertEquals(42, AddingMachine.getInstance().calculate(0, 42), 0);
    }

}
