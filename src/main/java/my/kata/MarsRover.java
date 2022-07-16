package my.kata;

public class MarsRover {
    public static final String MOVE_COMMAND = "M";
    public static final String TURN_LEFT_COMMAND = "L";
    public static final String TURN_RIGHT_COMMAND = "R";
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

    public void performStoredCommands(String command) {
        if (TURN_RIGHT_COMMAND.equals(command)) {
            if (SOUTH.equals(this.direction)) {
                this.direction = WEST;
            } else {
                this.direction = EAST;
            }
        }
        if (TURN_LEFT_COMMAND.equals(command)) {
            if (SOUTH.equals(this.direction)) {
                this.direction = EAST;
            } else  {
                this.direction = WEST;
            }
        }
        if (MOVE_COMMAND.equals(command)) {
            if(SOUTH.equals(this.direction)) {
                this.yCoordinate--;
            } else {
                this.yCoordinate++;
            }
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
}
