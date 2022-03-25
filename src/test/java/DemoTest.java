import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void add() {
        assertEquals(45, Demo.add(30,15));
    }

    @Test
    void multipy() {
        assertEquals(45, Demo.multipy(15,3));
    }
}