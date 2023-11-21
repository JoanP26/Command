package Commands;

import interfaces.Command;

public class Left implements Command {
    @Override
    public void execute() {
        System.out.println("Turn Left");
    }
}
