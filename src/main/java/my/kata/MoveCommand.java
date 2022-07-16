package my.kata;

import java.awt.Point;

public class MoveCommand implements Command {
    private MarsRover marsRover;

    public MoveCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        this.marsRover.move();
    }
}
