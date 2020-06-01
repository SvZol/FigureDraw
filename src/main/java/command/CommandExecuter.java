package command;

public class CommandExecuter{
    HelloCommand helloCommand;
    DrawCommand drawCommand;

    public void execution() throws Throwable {
        while(true) {
            helloCommand = new HelloCommand();
            helloCommand.execution();
            drawCommand = new DrawCommand(helloCommand);
            drawCommand.execution();
        }
    }
}
