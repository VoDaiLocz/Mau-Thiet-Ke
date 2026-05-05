package Command;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TouchPanel {
    private final Map<String, Command> buttons = new LinkedHashMap<>();
    private final Deque<Command> history = new ArrayDeque<>();
    private final List<String> logs = new ArrayList<>();

    public void setCommand(String buttonName, Command command) {
        buttons.put(buttonName, command);
    }

    public void pressButton(String buttonName) {
        Command command = buttons.get(buttonName);
        if (command == null) {
            System.out.println("No command assigned to button: " + buttonName);
            return;
        }

        command.execute();
        history.push(command);
        logs.add("EXECUTE: " + command.getName());
    }

    public void undo() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Command command = history.pop();
        command.undo();
        logs.add("UNDO: " + command.getName());
    }

    public void printLog() {
        System.out.println("Action log:");
        for (String log : logs) {
            System.out.println("- " + log);
        }
    }
}
