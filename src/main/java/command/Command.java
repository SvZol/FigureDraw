package command;

/**
 * Интерфейс Command. Обьявляет метод execution.
 * @author Svetlana Zolotareva
 */
public interface Command {
    /**
     * Выполнение команды
     * @throws Throwable
     */
    void execution() throws Throwable;
}
