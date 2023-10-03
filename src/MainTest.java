import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getPrice() {
        Calculate c = new Calculate();
        assertEquals(-1, c.getPrice(true, -1));
        assertEquals(0, c.getPrice(true, 1.3));
        assertEquals(0, c.getPrice(true, 1.55));
        assertEquals(0, c.getPrice(true, 1.8));
        assertEquals(-1, c.getPrice(true, 2.2));
        assertEquals(-1, c.getPrice(false, -2));
        assertEquals(100000, c.getPrice(false, 1));
        assertEquals(150000, c.getPrice(false, 1.6));
        assertEquals(200000, c.getPrice(false, 1.9));
        assertEquals(-1, c.getPrice(false, 2.4));
    }
}