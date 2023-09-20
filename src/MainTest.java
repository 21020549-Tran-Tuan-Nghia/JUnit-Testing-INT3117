import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getPrice() {
        Calculate c = new Calculate();
        assertEquals(-1, c.getPrice(-1, true));
        assertEquals(0, c.getPrice(1.3, true));
        assertEquals(0, c.getPrice(1.55, true));
        assertEquals(0, c.getPrice(1.8, true));
        assertEquals(-1, c.getPrice(2.2, true));
        assertEquals(-1, c.getPrice(-2, false));
        assertEquals(100000, c.getPrice(1, false));
        assertEquals(150000, c.getPrice(1.6, false));
        assertEquals(200000, c.getPrice(1.9, false));
        assertEquals(-1, c.getPrice(2.4, false));
    }
}