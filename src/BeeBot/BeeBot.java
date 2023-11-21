package BeeBot;

import interfaces.Command;

public class BeeBot {

    public void go(Command command){
        command.execute();
    }
}
