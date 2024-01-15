import static org.junit.Assert.*;

import java.lang.invoke.MethodHandles;

import org.junit.*;

public class Q6Test {
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
    public void testNonMatching() {
        assertFalse(Q6.matchStrings("Hija", "Bye"));
        assertFalse(Q6.matchStrings("Longerstring", " "));
    }

    @Test
    public void testPartialMatch() {
        assertFalse(Q6.matchStrings("Hi there", "ieea"));
        assertFalse(Q6.matchStrings("Hi there", "i e "));
        assertFalse(Q6.matchStrings("donkey string", " nf"));
    }

    @Test
    public void testFullMatch() {
        assertTrue(Q6.matchStrings("a really long string", "a ayl stg"));
        assertTrue(Q6.matchStrings("eeeeeeeeeee", "eeeee"));
        assertTrue(Q6.matchStrings("aeiouaeiou", "aiueio"));
    }
}
