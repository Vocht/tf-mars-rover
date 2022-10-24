import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EastFacingStrategyTest {
    private EastFacingStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new EastFacingStrategy();
    }

    @Test
    void moveForward() {
        var coordinate = strategy.moveForward(new Coordinate(0, 0));
        assertEquals(0, coordinate.getY());
        assertEquals(1, coordinate.getX());
    }

    @Test
    void moveBackward() {
        var coordinate = strategy.moveBackward(new Coordinate(0, 0));
        assertEquals(0, coordinate.getY());
        assertEquals(-1, coordinate.getX());
    }
}
