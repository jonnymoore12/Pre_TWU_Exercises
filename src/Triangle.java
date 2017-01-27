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
        for (int currentRow = 1; currentRow <= height; currentRow++) {
            triangle += repeatString("*", currentRow) + "\n";
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
            for (int currentRow = startLine; currentRow <= totalHeight; currentRow++) {
                isosceles += drawIsoscelesRow(currentRow, totalHeight, padding);
            }
        } else {
            for (int currentRow = startLine; currentRow >= 1; currentRow--) {
                isosceles += drawIsoscelesRow(currentRow, totalHeight, padding);
            }
        }
        return stripFinalCharacter(isosceles);
    }

    private String drawIsoscelesRow(int currentRow, int totalHeight, String padding) {
        String text = "";
        text += repeatString(" ", spaceLength(totalHeight, currentRow)) + padding;
        text += repeatString("*", starLength(currentRow));
        text += repeatString(" ", spaceLength(totalHeight, currentRow)) + padding + "\n";
        return text;
    }

    private int starLength(int currentRow) {
        return 2 * currentRow - 1;
    }

    private int spaceLength(int totalHeight, int currentRow) {
        return totalHeight - currentRow;
    }
}
