import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NorthFacingStrategyTest {
    private NorthFacingStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new NorthFacingStrategy();
    }

    @Test
    void moveForward() {
        var coordinate = strategy.moveForward(new Coordinate(0, 0));
        assertEquals(1, coordinate.getY());
        assertEquals(0, coordinate.getX());
    }

    @Test
    void moveBackward() {
        var coordinate = strategy.moveBackward(new Coordinate(0, 0));
        assertEquals(-1, coordinate.getY());
        assertEquals(0, coordinate.getX());
    }
}
