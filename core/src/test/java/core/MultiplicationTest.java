package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void testCalculate() {
        assertEquals(6.0, MultiplicationMachine.getInstance().calculate(3.0, 2.0), 0);
    }

}
