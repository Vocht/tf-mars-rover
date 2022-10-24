public class NorthFacingStrategy implements FacingStrategy {
    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.getX(), coordinate.getY() + 1);
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.getX(), coordinate.getY() - 1);
    }

    @Override
    public FacingDrection getFacingDirection() {
        return FacingDrection.NORTH;
    }
}
