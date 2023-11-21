package Commands;

import interfaces.Command;

public class Forward implements Command {
    @Override
    public void execute() {
        System.out.println("Move Forward");
    }
}
