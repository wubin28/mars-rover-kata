package my.kata;

public class MarsRover {
    public static final String MOVE_COMMAND = "M";
    public static final String TURN_LEFT_COMMAND = "L";
    public static final String WEST = "W";
    private int xCoordinate;
    private int yCoordinate;
    private String direction;

    public MarsRover(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public void performStoredCommands(String command) {
        if ("R".equals(command)) {
            this.direction = "E";
        }
        if (TURN_LEFT_COMMAND.equals(command)) {
            this.direction = WEST;
        }
        if (MOVE_COMMAND.equals(command)) {
            this.yCoordinate++;
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
