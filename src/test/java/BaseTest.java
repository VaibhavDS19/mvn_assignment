import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BaseTest {

    private int square(int x) {
        return x * x;
    }

    @Test
    void justAnExample() {
        assertEquals(25, square(5));
        assertEquals(9, square(3));
    }
}
