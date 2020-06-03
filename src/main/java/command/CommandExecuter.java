package command;

/**
 * Класс CommandExecuter, реализующий интерфейс command. В нём реализуется основная последовательность комаинд.
 * @author Svetlana Zolotareva
 */
public class CommandExecuter implements Command{
    /**Поле helloCommand*/
    HelloCommand helloCommand;
    /**Поле drawCommand*/
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
