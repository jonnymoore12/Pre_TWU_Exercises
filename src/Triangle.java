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
        String isosceles = "";
        for (int currentLine = 1; currentLine <= height; currentLine++) {
            isosceles += repeatString(" ", height-currentLine) + repeatString("*", 2*currentLine-1);
            isosceles += repeatString(" ", height-currentLine) + "\n";
        }
        return stripFinalCharacter(isosceles);
    }

    public String diamond(int height) {
        String diamond = isosceles(height) + "\n";
        for (int currentLine = height-1; currentLine >= 1; currentLine--) {
            diamond += repeatString(" ", height-currentLine) + repeatString("*", 2*currentLine-1);
            diamond += repeatString(" ", height-currentLine) + "\n";
        }
        return stripFinalCharacter(diamond);
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


}
