public class Rover {
    private Coordinate coordinate;
    private FacingStrategy facingStrategy;

    public Rover() {
        coordinate = new Coordinate(0, 0);
        facingStrategy = new NorthFacingStrategy();
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void moveForward() {
        coordinate = facingStrategy.moveForward(coordinate);
    }

    public void moveBackward() {
        coordinate = facingStrategy.moveBackward(coordinate);
    }

    public FacingDrection getFacingDirection() {
        return facingStrategy.getFacingDirection();
    }

    public void turnRight() {
        facingStrategy = switch(getFacingDirection()) {
            case NORTH -> new EastFacingStrategy();
            case EAST -> new SouthFacingStrategy();
            case SOUTH -> new WestFacingStrategy();
            case WEST -> new NorthFacingStrategy();
        };
    }

    public void turnLeft() {
        facingStrategy = switch(getFacingDirection()) {
            case NORTH -> new WestFacingStrategy();
            case EAST -> new NorthFacingStrategy();
            case SOUTH -> new EastFacingStrategy();
            case WEST -> new SouthFacingStrategy();
        };
    }
}
