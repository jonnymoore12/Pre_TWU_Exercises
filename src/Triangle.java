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

    private String repeatString(String str, int repetitions) {
        String total = "";
        for (int i = 0; i < repetitions; i++) {
            total += str;
        }
        return total;
    }
}
