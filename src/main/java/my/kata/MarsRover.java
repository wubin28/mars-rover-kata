package my.kata;

public class MarsRover {
    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    public static final String EAST = "E";
    private int xCoordinate;
    private int yCoordinate;
    private String direction;

    public MarsRover(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    private void adjustDirection(String west, String south, String north, String east) {
        if (SOUTH.equals(this.direction)) {
            this.direction = west;
        } else if (EAST.equals(this.direction)) {
            this.direction = south;
        } else if (WEST.equals(this.direction)) {
            this.direction = north;
        } else {
            this.direction = east;
        }
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public String getDirection() {
        return this.direction;
    }

    public void move() {
        if(SOUTH.equals(this.direction)) {
            this.yCoordinate--;
        } else if (EAST.equals(this.direction)) {
            this.xCoordinate++;
        } else if (WEST.equals(this.direction)) {
            this.xCoordinate--;
        } else {
            this.yCoordinate++;
        }
    }

    public void turnLeft() {
        adjustDirection(EAST, NORTH, SOUTH, WEST);
    }

    public void turnRight() {
        adjustDirection(WEST, SOUTH, NORTH, EAST);
    }
}
