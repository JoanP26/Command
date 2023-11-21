package BeeBot;

import interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class BeeBot {
    private List<Command> commandList;

    public BeeBot() {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void deleteCommand() {
        if (!commandList.isEmpty()) {
            commandList.remove(commandList.size() - 1);
        }
    }

    public void go() {
        for (Command command : commandList) {
            command.execute();
        }
        // Limpiar la lista después de ejecutar los comandos
        commandList.clear();
    }
}
