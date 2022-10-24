public class WestFacingStrategy implements FacingStrategy {
    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.getX() - 1, coordinate.getY());
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.getX() + 1, coordinate.getY());
    }

    @Override
    public FacingDrection getFacingDirection() {
        return FacingDrection.WEST;
    }
}
