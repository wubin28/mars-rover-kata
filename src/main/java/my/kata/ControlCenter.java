package my.kata;

public class ControlCenter {
    private Command command;

    public void storeCommands(Command command) {
        this.command = command;
    }

    public void performStoredCommands() {
        this.command.execute();
    }
}
