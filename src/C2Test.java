import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C2Test {
    @Test
    void getPrice() {
        Calculate c = new Calculate();
        assertEquals(0, c.getPrice(true, 1.1));
        assertEquals(-1, c.getPrice(true, -1));
        assertEquals(-1, c.getPrice(false, -3));
        assertEquals(100000, c.getPrice(false, 1.2));
        assertEquals(150000, c.getPrice(false, 1.65));
        assertEquals(200000, c.getPrice(false, 2));
        assertEquals(-1, c.getPrice(false, 2.2));
    }
}