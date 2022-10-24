import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CoordinateTest {
    @Test
    void initialize() {
        var coordinate = new Coordinate(0, 0);
        assertNotNull(coordinate);
    }

    @Test
    void shouldReportYValue() {
        var coordinate = new Coordinate(1, 2);
        assertEquals(2, coordinate.getY());
    }

    @Test
    void shouldReportXValue() {
        var coordinate = new Coordinate(1, 2);
        assertEquals(1, coordinate.getX());
    }
}
