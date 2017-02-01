package com.jonny.pre_twu_exercises;

import java.util.*;

public class PrimeFactors {

    public List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        return primeFactors;
    }
}
