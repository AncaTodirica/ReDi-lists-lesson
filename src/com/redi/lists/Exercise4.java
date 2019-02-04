package com.redi.lists;

import java.util.ArrayList;

//Create a method that generates a matrix using Lists.
// The columns will have ascending sizes.
// First column will have size 1, second size 2 and so one. Give the number of columns as a parameter to the method.
public class Exercise4 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = generateMatrix(5);

        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Integer> col = matrix.get(i);
            for (int j = 0; j < col.size(); j++) {
                System.out.print(col.get(j) + " ");
            }
            System.out.println();
        }

    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int size) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(size);
        for (int i = 1; i <= size; i++) {
            ArrayList<Integer> column = new ArrayList<>(i);
            for (int j = 1; j <= i; j++) {
                column.add(0);
            }
            matrix.add(column);
        }
        return matrix;
    }
}
