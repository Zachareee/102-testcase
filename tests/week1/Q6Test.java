import static org.junit.Assert.*;

import org.junit.Test;

public class Q6Test {
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
