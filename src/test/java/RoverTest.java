import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoverTest {
    @Test
    public void initializes() {
        var rover = new Rover();
        assertNotNull(rover);
    }
}
