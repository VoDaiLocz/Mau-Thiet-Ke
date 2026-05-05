package Command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MacroCommand implements Command {
    private final String name;
    private final List<Command> commands;

    public MacroCommand(String name, List<Command> commands) {
        this.name = name;
        this.commands = new ArrayList<>(commands);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        List<Command> reversedCommands = new ArrayList<>(commands);
        Collections.reverse(reversedCommands);
        for (Command command : reversedCommands) {
            command.undo();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
