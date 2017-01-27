public class Fizzbuzz {

    // I decided to implement Fizzbuzz as a class instead of the method we were instructed to code.
    public void firstOneHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(evaluate(i));
        }
    }

    // ... and then left this method public and kept the accompanying tests:
    public Object evaluate(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return number;
    }
}
