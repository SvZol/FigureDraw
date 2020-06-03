package figure;

/**
 * Энум Color. Определяет цвет фигуры
 * @autor Svetlana Zolotareva
 */
public enum Color {
    RED,
    BLUE,
    GREEN;

    /**
     *
     * @param i
     * @return соответствуюций цвет
     */
    public static Color whatColor(int i){
        if(i > 0 && i <= Color.values().length){
            return Color.values()[i - 1];
        }
        return null;
    }
}
