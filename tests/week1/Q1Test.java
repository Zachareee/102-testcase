import static org.junit.Assert.*;

import org.junit.Test;

public class Q1Test {
    @Test
    public void input0() {
        int actual = Q1.sumOfDigits(0);
        assertEquals(0, actual);
    }

    @Test
    public void inputNegative() {
        int actual = Q1.sumOfDigits(-704);
        assertEquals(11, actual);

        actual = Q1.sumOfDigits(-1100000);
        assertEquals(2, actual);
    }

    @Test
    public void inputPositive() {
        int actual = Q1.sumOfDigits(1);
        assertEquals(1, actual);

        actual = Q1.sumOfDigits(150);
        assertEquals(6, actual);
    }
}
