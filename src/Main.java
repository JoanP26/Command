import BeeBot.BeeBot;
import Commands.Back;
import Commands.Forward;
import Commands.Left;
import Commands.Right;
import interfaces.Command;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de comandos
        Command moveForward = new Forward();
        Command turnLeft = new Left();
        Command moveBack = new Back();
        Command turnRight = new Right();

        // Crear instancia de BeeBot
        BeeBot beebot = new BeeBot();

        // Ejecutar la secuencia de comandos
        beebot.go(moveForward);
        beebot.go(turnLeft);
        beebot.go(moveForward);
        beebot.go(moveForward);
        beebot.go(turnRight);
    }
}
