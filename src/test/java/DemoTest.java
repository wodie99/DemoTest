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

    @Test
    void modulo() {
        assertEquals(1, Demo.modulo(10,3));
    }

    @Test
    void plus1() {
        assertEquals(5, Demo.plus1(4));
    }

    @Test
    void minus1() {
        assertEquals(5, Demo.minus1(6));
    }
}