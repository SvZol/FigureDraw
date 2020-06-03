package command;

/**
 * Класс прощающийся с пользователем. Вызывается про вводе пользователем "exit"
 */
public class ExitCommand implements Command{
    @Override
    public void execution() {
        ConsoleHelper.write("Твои фигуры на http://localhost:9087");
        ConsoleHelper.write("Пока!");
        System.exit(0);
    }
}
