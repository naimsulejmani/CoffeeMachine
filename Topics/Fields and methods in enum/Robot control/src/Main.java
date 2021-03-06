
class Move {

    //just testing here :)
//    public static void main(String[] args) {
//        moveRobot(new Robot(0, 0, Direction.UP), 3, 0);
//    }

    private static void changeDirectionOfRobot(Robot robot, Direction toDirection) {
        while (robot.getDirection() != toDirection) {
            robot.turnRight();
        }
    }

    private static void goForward(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.LEFT) {
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else {
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        changeDirectionOfRobot(robot, robot.getX() < toX ? Direction.RIGHT : Direction.LEFT);
        goForward(robot, toX, toY);
        changeDirectionOfRobot(robot, robot.getY() < toY ? Direction.UP : Direction.DOWN);
        goForward(robot, toX, toY);

    }


}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}