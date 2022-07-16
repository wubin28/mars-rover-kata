package my.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_go_to_0_1_N_when_move_given_from_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.performStoredCommands("M");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(1, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }
}
