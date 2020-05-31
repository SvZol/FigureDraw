package command;

public class CommandExecuter{
    public static void execution() {
        HelloCommand helloCommand = new HelloCommand();
        helloCommand.execution();
        ConsoleHelper.write(helloCommand.getFigure().toString() + " " + helloCommand.getColor().toString() + " " + helloCommand.getCount());
    }
}
