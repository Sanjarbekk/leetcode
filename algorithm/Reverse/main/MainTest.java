import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MainTest {

    private Solution solution;

    @BeforeEach
    public void setUp() throws Exception{
        solution = new Solution();
    }

    @Test
    public void testMultiple() {
        assertEquals(21, solution.reverse(1200));

        assertEquals(121, solution.reverse(1210));

        assertEquals(555555555, solution.reverse(555555555));

        assertEquals(-21, solution.reverse(-1200));

        assertEquals(355, solution.reverse(55300000));

        assertEquals(0, solution.reverse(-2147483648));

        assertEquals(0, solution.reverse(2147483647));
    }

    @Test
    public void testZero() {
        assertEquals(0, solution.reverse(0));
    }
}