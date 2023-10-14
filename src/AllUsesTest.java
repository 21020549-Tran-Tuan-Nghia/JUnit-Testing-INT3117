import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllUsesTest {

    @Test
    void getPrice() {
        Calculate c = new Calculate();
        assertEquals(0, c.getPrice(true, 1.6));
        assertEquals(100000, c.getPrice(false, 1.1));
        assertEquals(150000, c.getPrice(false, 1.55));
        assertEquals(200000, c.getPrice(false, 1.8));
    }
}