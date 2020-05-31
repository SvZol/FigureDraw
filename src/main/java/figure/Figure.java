package figure;

public enum Figure {
    CIRCLE,
    SQUARE,
    TRIANGLE;
    public static Figure whatFigure(int i){
        if( i > 0 &&  i <= Figure.values().length){
            return Figure.values()[i - 1];
        }
        return null;
    }
}
