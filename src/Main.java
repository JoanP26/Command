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

        // Agregar comandos a la lista
        beebot.addCommand(moveForward);
        beebot.addCommand(turnLeft);
        beebot.addCommand(moveForward);
        beebot.addCommand(moveForward);
        beebot.addCommand(turnRight);

        // Borrar el último comando
        beebot.deleteCommand();

        // Ejecutar la secuencia de comandos almacenados
        beebot.go();
    }
}
