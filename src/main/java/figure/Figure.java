package figure;

/**
 * Энум Figure. Определяет тип фигуры
 * @author Svetlana Zolotareva
 */
public enum Figure {
    CIRCLE,
    SQUARE,
    TRIANGLE;

    /**
     *
     * @param i
     * @return соответствующую фигуру
     */
    public static Figure whatFigure(int i){
        if( i > 0 &&  i <= Figure.values().length){
            return Figure.values()[i - 1];
        }
        return null;
    }
}
