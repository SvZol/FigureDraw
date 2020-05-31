package command;

import figure.Color;
import figure.Figure;


public class HelloCommand implements Command {
    private Figure figure;
    private Color color;
    private int count;

    public HelloCommand() {
    }

    @Override
    public void execution() {
        ConsoleHelper.write("Привет.");
        ConsoleHelper.write("Кукую фигуру ты хочешь нарисовать? Введи подходящую цифру:");
        ConsoleHelper.write("1 - круг");
        ConsoleHelper.write("2 - квадрат");
        ConsoleHelper.write("3 - треугольник");
        int i = ConsoleHelper.readInt();
        while(Figure.whatFigure(i) == null){
            ConsoleHelper.write("Такой фигуры нет. Попробуй ещё раз!");
            i = ConsoleHelper.readInt();
        }
        this.figure = Figure.whatFigure(i);
        ConsoleHelper.write("Какого цвета она будет?");
        ConsoleHelper.write("1 - красный");
        ConsoleHelper.write("2 - синий");
        ConsoleHelper.write("3 - зелёный");
        int j = ConsoleHelper.readInt();
        while (Color.whatColor(j) == null){
            ConsoleHelper.write("Такого цвета нет. Поробуй ещё раз!");
            j = ConsoleHelper.readInt();
        }
        this.color = Color.whatColor(j);
        ConsoleHelper.write("хорошо. А сколько их надо?");
        this.count = ConsoleHelper.readInt();
    }

    public int getCount() {
        return count;
    }

    public Color getColor() {
        return color;
    }

    public Figure getFigure() {
        return figure;
    }
}
