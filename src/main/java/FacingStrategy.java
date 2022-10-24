public interface FacingStrategy {
    Coordinate moveForward(Coordinate coordinate);
    Coordinate moveBackward(Coordinate coordinate);

    FacingDrection getFacingDirection();
}
