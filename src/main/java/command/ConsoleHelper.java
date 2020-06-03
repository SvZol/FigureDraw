package command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс ConsoleHelper. Это единстенный класс, общающийся с консолью.
 * @author Svetlana Zolotareva
 */
public class ConsoleHelper{
    /**
     * Метод, выводяций строку s в консоль
     * @param s
     */
    public static void write(String s){
        System.out.println(s);
    }

    /**
     * Мктод, сцитывающий строку с консоли
     * @return веденную пользователем строку
     */
    public static String readString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s =  reader.readLine();
            if ("exit".equals(s)){
                (new ExitCommand()).execution();
            }
        } catch (IOException e) {
            write("Здесь что-то не так!");
        }
        return s;
    }

    /**
     * Метод, сцитывающий число с косоли
     * @return число, введенное пользователем
     */
    public static int readInt(){
        int i = 0;
        try {
            i = Integer.parseInt(readString());
        }catch (NumberFormatException e){
            write("Попробуй ещё раз");
            readInt();
        }
        return i;
    }
}