package command;

public class CommandExecuter{
    static HelloCommand helloCommand = new HelloCommand();
    static DrawCommand drawCommand = new DrawCommand();
    public static void execution() throws Throwable {
        helloCommand.execution();
        drawCommand.execution();
    }
}
