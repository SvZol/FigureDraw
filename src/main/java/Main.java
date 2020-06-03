import command.CommandExecuter;
import command.ConsoleHelper;

/**
 * Класс main с вызовом CommandExecuter и обрабткой исключения.
 * @author Sveta Zolotareva
 * version 1.0
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Поле CommandExecutor
         */
        CommandExecuter commandExecuter = new CommandExecuter();
        try {
            commandExecuter.execution();
        } catch (java.lang.Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
