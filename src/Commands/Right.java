package Commands;

import interfaces.Command;

public class Right implements Command {
    @Override
    public void execute() {
        System.out.println("Turn Right");
    }
}
