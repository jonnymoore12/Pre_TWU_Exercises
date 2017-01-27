public class Triangle {
    public void easiestExercise() {
        System.out.print("*");
    }

    // I've decided to allow the next few methods to return instead of PRINT to console
    // to save me from repeatedly testing outContent (I fancied TDD-ing these):
    public String horizontalLine(int repetitions) {
        return repeatString("*", repetitions);
    }

    public String verticalLine(int repetitions) {
        return stripFinalCharacter(repeatString("*\n", repetitions));
    }

    public String rightTriangle(int height) {
        String triangle = "";
        for (int currentLine = 1; currentLine <= height; currentLine++) {
            triangle += repeatString("*", currentLine) + "\n";
        }
        return stripFinalCharacter(triangle);
    }

    public String isosceles(int height) {
        return isoscelesGenerator(1, true, height, "");
    }

    public String diamond(int height) {
        return isoscelesGenerator(1, true, height, "") + "\n" + isoscelesGenerator(height-1, false, height, "");
    }

    public String diamondWithName(int height, String name) {
        return isoscelesGenerator(1, true, height-1, " ") + "\n" + name + "\n" + isoscelesGenerator(height-1, false, height, "");
    }

    private String repeatString(String str, int repetitions) {
        String total = "";
        for (int i = 0; i < repetitions; i++) {
            total += str;
        }
        return total;
    }

    private String stripFinalCharacter(String input) {
        return input.substring(0,input.length()-1);
    }

    private String isoscelesGenerator(int startLine, boolean ascending, int totalHeight, String padding) {
        String isosceles = "";

        if (ascending == true) {
            for (int currentLine = startLine; currentLine <= totalHeight; currentLine++) {
                isosceles += repeatString(" ", spaceLength(totalHeight, currentLine)) + padding;
                isosceles += repeatString("*", starLength(currentLine));
                isosceles += repeatString(" ", spaceLength(totalHeight, currentLine)) + padding + "\n";
            }
        } else {
            for (int currentLine = startLine; currentLine >= 1; currentLine--) {
                isosceles += repeatString(" ", spaceLength(totalHeight, currentLine));
                isosceles += repeatString("*", starLength(currentLine));
                isosceles += repeatString(" ", spaceLength(totalHeight, currentLine)) + "\n";
            }
        }

        return stripFinalCharacter(isosceles);
    }

    private int starLength(int currentLine) {
        return 2 * currentLine - 1;
    }

    private int spaceLength(int totalHeight, int currentLine) {
        return totalHeight - currentLine;
    }

}
