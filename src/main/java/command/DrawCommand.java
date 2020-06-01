package command;

import figure.Color;
import figure.Figure;

import java.util.HashMap;
import java.util.Map;

public class DrawCommand implements Command{


    @Override
    public void execution() throws Throwable {
        Map<Color, String> colorMap = new HashMap<>();
            colorMap.put(Color.RED, "#800000;");
            colorMap.put(Color.BLUE, "#0000FF;");
            colorMap.put(Color.GREEN, "#008000;");
        String color =  colorMap.get(CommandExecuter.helloCommand.getColor());
        String squareHtmlCod = "<head>\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<style>\n" +
                ".square {\n" +
                "  height: 65px;\n" +
                "  width: 65px;\n" +
                "background-color: " + color +
                "border-left: 5px solid white;\n" +
                "border-right: 5px solid white;\n" +
                "border-bottom: 5px solid white"+
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"square\"></div>\n" +
                "</body>";
        String circleHtmlCod = "<head>\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<style>\n" +
                ".circle{\n" +
                "    height: 65px;\n" +
                "    width: 65px;\n" +
                "    border-radius: 50%;\n" +
                "background-color: " + color +
                "}" +
                "</style>\n" +  "</head>\n" +
                "<body>\n" +
                "<div class=\"circle\"></div>\n" +
                "</body>";
        String triangleHtmlCod =
                "<head>\n" +
                        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                        "<style>\n" +
                        ".triangle{\n" +
                        "width: 0;\n" +
                        "height: 0;\n" +
                        "border-left: 50px solid transparent;\n" +
                        "border-right: 50px solid transparent;\n" +
                        "border-bottom: 100px solid " + color +
                        "}" +
                        "</style>\n" +  "</head>\n" +
                        "<body>\n" +
                        "<div class=\"triangle\"></div>\n" +
                        "</body>";
         Map<Figure, String> figureMap= new HashMap<>();
            figureMap.put(Figure.TRIANGLE, triangleHtmlCod);
            figureMap.put(Figure.SQUARE, squareHtmlCod);
            figureMap.put(Figure.CIRCLE, circleHtmlCod);
        String res = "<html>";
        for(int j = 0; j < CommandExecuter.helloCommand.getCount(); j++){
            res += figureMap.get(CommandExecuter.helloCommand.getFigure());
        }
        res += "</html>";
        UpPrintServer.go(res);
    }

}
