package figure;

public enum Color {
    RED,
    BLUE,
    GREEN;
    public static Color whatColor(int i){
        if(i > 0 && i <= Color.values().length){
            return Color.values()[i - 1];
        }
        return null;
    }
}
