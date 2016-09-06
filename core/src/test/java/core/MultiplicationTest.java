package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void test() {
        assertEquals(6, MultiplicationMachine.getInstance().calculate(2, 3), 0);
    }

}
