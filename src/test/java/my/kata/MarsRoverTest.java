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

    @Test
    void should_go_to_0_0_W_when_turn_left_given_from_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.performStoredCommands("L");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_turn_right_given_from_0_0_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.performStoredCommands("R");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_minus_1_S_when_move_given_from_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.performStoredCommands("M");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(-1, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_turn_left_given_from_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.performStoredCommands("L");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_turn_right_given_from_0_0_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.performStoredCommands("R");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_1_0_E_when_move_given_from_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.performStoredCommands("M");

        // then
        assertEquals(1, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_turn_left_given_from_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.performStoredCommands("L");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_turn_right_given_from_0_0_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.performStoredCommands("R");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_minus_1_0_W_when_move_given_from_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.performStoredCommands("M");

        // then
        assertEquals(1, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_turn_left_given_from_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.performStoredCommands("L");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_turn_right_given_from_0_0_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.performStoredCommands("R");

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }
}
