import static org.junit.Assert.*;

import java.lang.invoke.MethodHandles;

import org.junit.*;

public class Q1Test {
    @BeforeClass
    public static void testAll() {
        try {
            String classname = MethodHandles.lookup().lookupClass()
                    .getName().replaceAll("Test", "");
            Class.forName(classname);
        } catch (ClassNotFoundException e) {
            Assert.fail(e.getLocalizedMessage() + ".class not found (Compile failed?)");
        }
    }

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
