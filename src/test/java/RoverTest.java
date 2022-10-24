import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoverTest {
    private Rover rover;

    @BeforeEach
    void setUp() {
        rover = new Rover();
    }

    @Test
    public void initializes() {
        assertNotNull(rover);
    }

    @Test
    void reportCoordinate() {
        var coordinate = rover.getCoordinate();
        assertNotNull(coordinate);
    }

    @Test
    void roverPosition() {
        var coordinate = rover.getCoordinate();
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
    }

    @Test
    void moveForward_WhenFacingNorth() {
        var facingDirection = rover.getFacingDirection();
        assertEquals(facingDirection, FacingDrection.NORTH);
        var coordinate = rover.getCoordinate();
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
        rover.moveForward();
        var newCoordinate = rover.getCoordinate();
        assertEquals(0, newCoordinate.getX());
        assertEquals(1, newCoordinate.getY());
    }

    @Test
    void moveForward_WhenFacingEast() {
        rover.turnRight();
        var facingDirection = rover.getFacingDirection();
        assertEquals(facingDirection, FacingDrection.EAST);
        var coordinate = rover.getCoordinate();
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
        rover.moveForward();
        var newCoordinate = rover.getCoordinate();
        assertEquals(1, newCoordinate.getX());
        assertEquals(0, newCoordinate.getY());
    }

    @Test
    void moveForward_WhenFacingSouth() {
        rover.turnRight();
        rover.turnRight();
        var facingDirection = rover.getFacingDirection();
        assertEquals(facingDirection, FacingDrection.SOUTH);
        var coordinate = rover.getCoordinate();
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
        rover.moveForward();
        var newCoordinate = rover.getCoordinate();
        assertEquals(0, newCoordinate.getX());
        assertEquals(-1, newCoordinate.getY());
    }

    @Test
    void moveForward_WhenFacingWest() {
        rover.turnLeft();
        var facingDirection = rover.getFacingDirection();
        assertEquals(facingDirection, FacingDrection.WEST);
        var coordinate = rover.getCoordinate();
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
        rover.moveForward();
        var newCoordinate = rover.getCoordinate();
        assertEquals(-1, newCoordinate.getX());
        assertEquals(0, newCoordinate.getY());
    }

    @Test
    void moveBackward_WhenFacingNorth() {
        var coordinate = rover.getCoordinate();
        var facingDirection = rover.getFacingDirection();
        assertEquals(facingDirection, FacingDrection.NORTH);
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
        rover.moveBackward();
        var newCoordinate = rover.getCoordinate();
        assertEquals(0, newCoordinate.getX());
        assertEquals(-1, newCoordinate.getY());
    }

    @Test
    void moveBackward_WhenFacingEast() {
        rover.turnRight();
        var coordinate = rover.getCoordinate();
        var facingDirection = rover.getFacingDirection();
        assertEquals(facingDirection, FacingDrection.EAST);
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
        rover.moveBackward();
        var newCoordinate = rover.getCoordinate();
        assertEquals(-1, newCoordinate.getX());
        assertEquals(0, newCoordinate.getY());
    }

    @Test
    void moveBackward_WhenFacingSouth() {
        rover.turnRight();
        rover.turnRight();
        var coordinate = rover.getCoordinate();
        var facingDirection = rover.getFacingDirection();
        assertEquals(facingDirection, FacingDrection.SOUTH);
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
        rover.moveBackward();
        var newCoordinate = rover.getCoordinate();
        assertEquals(0, newCoordinate.getX());
        assertEquals(1, newCoordinate.getY());
    }

    @Test
    void moveBackward_WhenFacingWest() {
        rover.turnLeft();
        var coordinate = rover.getCoordinate();
        var facingDirection = rover.getFacingDirection();
        assertEquals(facingDirection, FacingDrection.WEST);
        assertEquals(0, coordinate.getX());
        assertEquals(0, coordinate.getY());
        rover.moveBackward();
        var newCoordinate = rover.getCoordinate();
        assertEquals(1, newCoordinate.getX());
        assertEquals(0, newCoordinate.getY());
    }

    @Test
    void getInitialFacingDirection() {
        assertEquals(FacingDrection.NORTH, rover.getFacingDirection());
    }

    @Test
    void turnRight_GivenNorthFacingDirection() {
        assertEquals(FacingDrection.NORTH, rover.getFacingDirection());
        rover.turnRight();
        assertEquals(FacingDrection.EAST, rover.getFacingDirection());
    }

    @Test
    void turnRight_GivenEastFacingDirection() {
        rover.turnRight();
        assertEquals(FacingDrection.EAST, rover.getFacingDirection());
        rover.turnRight();
        assertEquals(FacingDrection.SOUTH, rover.getFacingDirection());
    }

    @Test
    void turnRight_GivenSouthFacingDirection() {
        rover.turnRight();
        rover.turnRight();
        assertEquals(FacingDrection.SOUTH, rover.getFacingDirection());
        rover.turnRight();
        assertEquals(FacingDrection.WEST, rover.getFacingDirection());
    }

    @Test
    void turnRight_GivenWestFacingDirection() {
        rover.turnLeft();
        assertEquals(FacingDrection.WEST, rover.getFacingDirection());
        rover.turnRight();
        assertEquals(FacingDrection.NORTH, rover.getFacingDirection());
    }

    @Test
    void turnLeft_GivenNorthFacingDirection() {
        assertEquals(FacingDrection.NORTH, rover.getFacingDirection());
        rover.turnLeft();
        assertEquals(FacingDrection.WEST, rover.getFacingDirection());
    }

    @Test
    void turnLeft_GivenEastFacingDirection() {
        rover.turnRight();
        assertEquals(FacingDrection.EAST, rover.getFacingDirection());
        rover.turnLeft();
        assertEquals(FacingDrection.NORTH, rover.getFacingDirection());
    }

    @Test
    void turnLeft_GivenSouthFacingDirection() {
        rover.turnRight();
        rover.turnRight();
        assertEquals(FacingDrection.SOUTH, rover.getFacingDirection());
        rover.turnLeft();
        assertEquals(FacingDrection.EAST, rover.getFacingDirection());
    }

    @Test
    void turnLeft_GivenWestFacingDirection() {
        rover.turnLeft();
        assertEquals(FacingDrection.WEST, rover.getFacingDirection());
        rover.turnLeft();
        assertEquals(FacingDrection.SOUTH, rover.getFacingDirection());
    }
}
