import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q6Test {
    @Test
    public void testEmpty() {
        boolean matchHiAndBye = Q6.matchStrings("Hi", "Bye");
        assertEquals(matchHiAndBye, true);
    }
}
