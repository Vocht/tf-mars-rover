import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SouthFacingStrategyTest {
    private SouthFacingStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new SouthFacingStrategy();
    }

    @Test
    void moveForward() {
        var coordinate = strategy.moveForward(new Coordinate(0, 0));
        assertEquals(-1, coordinate.getY());
        assertEquals(0, coordinate.getX());
    }

    @Test
    void moveBackward() {
        var coordinate = strategy.moveBackward(new Coordinate(0, 0));
        assertEquals(1, coordinate.getY());
        assertEquals(0, coordinate.getX());
    }
}
