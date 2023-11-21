package Commands;

import interfaces.Command;

public class Back implements Command {
    @Override
    public void execute() {
        System.out.println("Move Backward");
    }
}
