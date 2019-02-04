package com.redi.lists;

import java.util.ArrayList;
import java.util.List;

//Generate the Fibonacci sequence in a List.
//Give the number of fibonacci numbers to be generated as a parameter.
public class Exercise2 {

    public static void main(String[] args) {
        ArrayList<Integer> fibonacciNumbers = fibonacci(20);

        fibonacciNumbers.forEach(number -> System.out.println(number + " "));
    }

    public static ArrayList<Integer> fibonacci(int numberOfItems) {
        ArrayList<Integer> fibonacci = new ArrayList<>(numberOfItems);
        fibonacci.add(1);
        fibonacci.add(1);

        for (int i = 2; i < numberOfItems; i++) {
            fibonacci.add(i, fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        return fibonacci;
    }
}
