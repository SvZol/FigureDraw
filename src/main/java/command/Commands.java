package command;

public enum Commands {

    HELLO,
    DRAW,
    EXIT;
    public Commands takeCommand(int i){
        if(i > 0 && i <= Commands.values().length) {
            return Commands.values()[i - 1];
        }
        return null;
    }
}
