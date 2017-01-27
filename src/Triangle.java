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
        return repeatString("*\n", repetitions);
    }

    public String rightTriangle(int height) {
        String triangle = "";
        for (int i = 1; i <= height; i++) {
            triangle += repeatString("*", i);
            triangle += "\n";
        }
        return triangle;
    }

    private String repeatString(String str, int repetitions) {
        String total = "";
        for (int i = 0; i < repetitions; i++) {
            total += str;
        }
        return total;
    }
}
