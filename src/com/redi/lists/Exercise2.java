package com.redi.lists;

import java.util.ArrayList;
import java.util.Arrays;

//Generate the Fibonacci sequence in a List.
//Give the number of getFibonacciSequence numbers to be generated as a parameter.
public class Exercise2 {

    public static void main(String[] args) {
        ArrayList<Integer> fibonacciNumbers = getFibonacciSequence(20);

        fibonacciNumbers.forEach(number -> System.out.println(number + " "));
    }

    public static ArrayList<Integer> getFibonacciSequence(int numberOfItems) {
        ArrayList<Integer> fibonacci = new ArrayList<>(Arrays.asList(1,1));

        for (int i = 2; i < numberOfItems; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        return fibonacci;
    }
}
