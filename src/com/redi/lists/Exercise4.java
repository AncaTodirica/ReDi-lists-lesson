package com.redi.lists;

import java.util.ArrayList;

//Create a method that generates a matrix using Lists.
// The columns will have ascending sizes.
// First column will have size 1, second size 2 and so one. Give the number of columns as a parameter to the method.
public class Exercise4 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = generateMatrix(5);

        //iterate trough the rows
        for (int i = 0; i < matrix.size(); i++) {
            //get row one by one at position i
            ArrayList<Integer> row = matrix.get(i);
            // iterate trough the items of the row (columns) and print
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + " ");
            }
            System.out.println();
        }

    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int size) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(size);
        //iterate trough the number of rows
        for (int i = 0; i < size; i++) {
            // create a new ArrayList for each row, with i number of items
            ArrayList<Integer> row = new ArrayList<>(i);
            for (int j = 0; j <= i; j++) {
                row.add(0);
            }
            matrix.add(row);
        }
        return matrix;
    }
}
