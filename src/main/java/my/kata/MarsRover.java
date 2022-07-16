package my.kata;

public class MarsRover {
    public static final String MOVE_COMMAND = "M";
    public static final String TURN_LEFT_COMMAND = "L";
    public static final String TURN_RIGHT_COMMAND = "R";
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

    public void performStoredCommands(String commands) {
        char[] commandsInArray = commands.toCharArray();
        for (char command : commandsInArray) {
            performOneCommand(Character.toString(command));
        }
    }

    private void performOneCommand(String command) {
        if (TURN_RIGHT_COMMAND.equals(command)) {
            adjustDirection(WEST, SOUTH, NORTH, EAST);
        } else if (TURN_LEFT_COMMAND.equals(command)) {
            adjustDirection(EAST, NORTH, SOUTH, WEST);
        } else if (MOVE_COMMAND.equals(command)) {
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
