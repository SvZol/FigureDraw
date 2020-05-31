package command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper{

    public static void write(String s){
        System.out.println(s);
    }
    public static String readString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s =  reader.readLine();
        } catch (IOException e) {
            write("Здесь что-то не так!");
        }
        return s;
    }
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