package my.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// To check out the Command Pattern, refer to https://www.jianshu.com/p/da8712663542
// Client: ControlCenterTest
// Invoker: ControlCenter
// Receiver: MarsRover
// Command: Command, TurnLeftCommand, TurnRightCommand, MoveCommand
public class ControlCenterTest {
    @Test
    void should_go_to_0_1_N_when_move_given_from_0_0_N() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "N");
        MoveCommand moveCommand = new MoveCommand(marsRover);
        controlCenter.storeCommands(moveCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(1, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }
}
