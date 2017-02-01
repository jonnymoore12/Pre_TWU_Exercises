package com.jonny.pre_twu_exercises;

public class Fizzbuzz {

    // I decided to implement Fizzbuzz as a class instead of the method we were instructed to code.
    public void firstOneHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(evaluate(i));
        }
    }

    // ... and then left this method public and kept the accompanying tests:
    public Object evaluate(int number) {
        if (isDivisibleByThreeAndFive(number)) {
            return "fizzbuzz";
        } else if (isDivisibleByFive(number)) {
            return "buzz";
        } else if (isDivisibleByThree(number)) {
            return "fizz";
        }
        return number;
    }

    private Boolean isDivisibleByThree(int number) {
        return (number % 3 == 0);
    }

    private Boolean isDivisibleByFive(int number) {
        return (number % 5 == 0);
    }

    private Boolean isDivisibleByThreeAndFive(int number) {
        return (number % 15 == 0);
    }
}
